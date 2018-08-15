/**
 * @author Jesus Armando Macias Benitez
 */
package mx.com.amx.wsb.yog.adminservices.ws;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import mx.com.amx.wsb.yog.adminservices.dto.ParametrosDTO;
import mx.com.amx.wsb.yog.adminservices.model.CMSUsuario;
import mx.com.amx.wsb.yog.adminservices.utils.PropertiesUtils;
import mx.com.amx.wsb.yog.adminservices.ws.exception.CallWSException;

/**
 * @author  Jesus Armando Macias Benitez
 *
 */
public class CMSUsuarioCallWS {
	private static Logger logger = Logger.getLogger(CMSUsuarioCallWS.class);

	private RestTemplate restTemplate;
	private HttpHeaders headers = new HttpHeaders();
	private final Properties props = new Properties();

	public CMSUsuarioCallWS() {
		super();
		restTemplate = new RestTemplate();
		ClientHttpRequestFactory factory = restTemplate.getRequestFactory();

		if (factory instanceof SimpleClientHttpRequestFactory) {
			((SimpleClientHttpRequestFactory) factory).setConnectTimeout(15 * 1000);
			((SimpleClientHttpRequestFactory) factory).setReadTimeout(15 * 1000);
			System.out.println("Inicializando rest template 1");
		} else if (factory instanceof HttpComponentsClientHttpRequestFactory) {
			((HttpComponentsClientHttpRequestFactory) factory).setReadTimeout(15 * 1000);
			((HttpComponentsClientHttpRequestFactory) factory).setConnectTimeout(15 * 1000);
			System.out.println("Inicializando rest template 2");
		}

		restTemplate.setRequestFactory(factory);
		headers.setContentType(MediaType.APPLICATION_JSON);

		try {
			props.load(this.getClass().getResourceAsStream("/general.properties"));
		} catch (Exception e) {
			logger.error("[ConsumeWS::init]Error al iniciar y cargar arhivo de propiedades." + e.getMessage());

		}

	}

	public List<CMSUsuario> findAll() throws CallWSException {
		logger.debug("--- findAll --- [ CMSUsuarioCallWS ] --- ");

		PropertiesUtils properties = new PropertiesUtils();
		ParametrosDTO parametros = null;
		List<CMSUsuario> lista = null;

		try {

			parametros = properties.obtenerPropiedades();
			String URL_WS = parametros.getUrl() + parametros.getCatalogos() + parametros.getCms()  + parametros.getUsuarioController();

			logger.debug("URL_WS: " + URL_WS);

			HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
			lista = Arrays.asList(restTemplate.postForObject(URL_WS, entity, CMSUsuario[].class));

		} catch (RestClientResponseException rre) {
			logger.error("RestClientResponseException findAll [ CMSUsuarioCallWS ]: " + rre.getResponseBodyAsString());
			logger.error("RestClientResponseException findAll [ CMSUsuarioCallWS ]: ", rre);
			throw new CallWSException(rre.getResponseBodyAsString());
		} catch (Exception e) {
			logger.error("Exception findAll  [ CMSUsuarioCallWS ]: ", e);
			throw new CallWSException(e.getMessage());
		}
		return lista;

	}

	public CMSUsuario findByCN(String cn) throws CallWSException {
		logger.debug("--- findByCN --- [ CMSUsuarioCallWS ] --- ");
		logger.debug("--- cn : " + cn + " --- ");

		PropertiesUtils properties = new PropertiesUtils();
		ParametrosDTO parametros = null;
		

		try {

			parametros = properties.obtenerPropiedades();
			String URL_WS = parametros.getUrl() + parametros.getCatalogos() + parametros.getCms()  +parametros.getUsuarioController() + cn + "/";
			logger.debug("URL_WS: " + URL_WS);

			HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
			return restTemplate.postForObject(URL_WS, entity, CMSUsuario.class);

		} catch (RestClientResponseException rre) {
			logger.error("RestClientResponseException findByCN [ CMSUsuarioCallWS ]: "
					+ rre.getResponseBodyAsString());
			logger.error("RestClientResponseException findByCN [ CMSUsuarioCallWS ]: ", rre);
			throw new CallWSException(rre.getResponseBodyAsString());
		} catch (Exception e) {
			logger.error("Exception findByCN  [ CMSUsuarioCallWS ]: ", e);
			throw new CallWSException(e.getMessage());
		}

	}

}
