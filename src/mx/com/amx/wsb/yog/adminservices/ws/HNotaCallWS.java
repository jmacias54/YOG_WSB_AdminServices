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
import org.springframework.web.client.RestTemplate;

import mx.com.amx.wsb.yog.adminservices.dto.ParametrosDTO;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsFilterRequest;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsRequest;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsRequestByTitle;
import mx.com.amx.wsb.yog.adminservices.model.response.ItemsResponse;
import mx.com.amx.wsb.yog.adminservices.utils.PropertiesUtils;
import mx.com.amx.wsb.yog.adminservices.ws.exception.CallWSException;

/**
 * @author  Jesus Armando Macias Benitez
 *
 */
public class HNotaCallWS {
	
	private static Logger logger = Logger.getLogger(HNotaCallWS.class);

	private RestTemplate restTemplate;
	private HttpHeaders headers = new HttpHeaders();
	private final Properties props = new Properties();

	public HNotaCallWS() {
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
	
	
	public List<ItemsResponse> getListItemsByFilter( ItemsFilterRequest req) throws CallWSException {
		logger.info("--- get_list_items_filter  [ NNotaCallWS ] ----");
		PropertiesUtils properties = new PropertiesUtils();
		ParametrosDTO parametros = null;
		List<ItemsResponse> lista = null;

		try {
			parametros = properties.obtenerPropiedades();
			String URL_WS = parametros.getUrl() + parametros.getHnotaController() + "get_list_items_filter" ;

			logger.debug("URL_WS: " + URL_WS);

			HttpEntity<ItemsFilterRequest> entity = new HttpEntity<ItemsFilterRequest>(req);
			lista = Arrays.asList(restTemplate.postForObject(URL_WS, entity, ItemsResponse[].class));
		} catch (Exception e) {
			logger.error("---Error get_list_items_filter  [ NNotaCallWS ] :" + e.getMessage());
			throw new CallWSException(e.getMessage());
		}

		return lista;
	}


	public List<ItemsResponse> getListItems( ItemsRequest req) throws CallWSException {
		logger.info("--- get_list_items [ NNotaCallWS ] ----");
		PropertiesUtils properties = new PropertiesUtils();
		ParametrosDTO parametros = null;
		List<ItemsResponse> lista = null;

		try {
			parametros = properties.obtenerPropiedades();
			String URL_WS = parametros.getUrl() + parametros.getHnotaController() + "get_list_items";
			logger.debug("URL_WS: " + URL_WS);

			HttpEntity<ItemsRequest> entity = new HttpEntity<ItemsRequest>(req);
			lista = Arrays.asList(restTemplate.postForObject(URL_WS, entity, ItemsResponse[].class));
		} catch (Exception e) {

			logger.error("---Error get_list_items  [ NNotaCallWS ] :" + e.getMessage());
			throw new CallWSException(e.getMessage());
		}

		return lista;
	}

	
	public List<ItemsResponse> getListItemsByTitle( ItemsRequestByTitle req) throws CallWSException {
		logger.info("--- getListItemsByTitle [ NNotaCallWS ] ----");
		PropertiesUtils properties = new PropertiesUtils();
		ParametrosDTO parametros = null;
		List<ItemsResponse> lista = null;

		try {
			parametros = properties.obtenerPropiedades();
			String URL_WS = parametros.getUrl() + parametros.getHnotaController() + "get_list_items_search";
			
			
			
			logger.debug("URL_WS: " + URL_WS);

			HttpEntity<ItemsRequestByTitle> entity = new HttpEntity<ItemsRequestByTitle>(req);
			//HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
			lista = Arrays.asList(restTemplate.postForObject(URL_WS, entity, ItemsResponse[].class));
			
			
			
		} catch (Exception e) {

			logger.error("---Error getListItemsByTitle  [ NNotaCallWS ] :" + e.getMessage());
			throw new CallWSException(e.getMessage());
		}

		return lista;
	}

}
