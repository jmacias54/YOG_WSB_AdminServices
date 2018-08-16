package mx.com.amx.wsb.yog.adminservices.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import mx.com.amx.wsb.yog.adminservices.dto.ParametrosDTO;




public class PropertiesUtils {

	// LOG
	private static Logger logger = Logger.getLogger(PropertiesUtils.class);

	/**
	 * Metodo encargado de generar el DTO con la informacion del properties.
	 * 
	 * @return ParametrosDTO
	 * @throws ProcesoWorkflowException
	 */
	public  ParametrosDTO obtenerPropiedades() throws Exception 
	{	
		logger.debug("Inicia obtenerPropiedades en PropertiesUtils");
		ParametrosDTO parametrosDTO = new ParametrosDTO();		 
		try {	    		
			//Properties war
			Properties propsWAR = new Properties();
			propsWAR.load(this.getClass().getResourceAsStream( "/general.properties" ));
			String ambiente = propsWAR.getProperty("ambiente");
			String rutaProperties = propsWAR.getProperty("ambiente.resources.properties".replace("ambiente", ambiente));
			
			//Properties server
			Properties propsServer = new Properties();		
			propsServer.load(new FileInputStream(new File(rutaProperties)));
			
			
			parametrosDTO.setAmbiente(ambiente);
			parametrosDTO.setUrl(propsServer.getProperty(ambiente+".wsd.url"));
			parametrosDTO.setDominio(propsServer.getProperty(ambiente+".dominio"));
			
			
			parametrosDTO.setNnotaController(propsServer.getProperty("nnota"));
			parametrosDTO.setHnotaController(propsServer.getProperty("hnota"));
			
			parametrosDTO.setCatalogos(propsServer.getProperty("controller.catalogos"));
			parametrosDTO.setCategoriaController(propsServer.getProperty("controller.catalogos.categoria"));
			parametrosDTO.setDeportesController(propsServer.getProperty("controller.catalogos.deportes"));
			parametrosDTO.setEstatusNotaController(propsServer.getProperty("controller.catalogos.estatus-nota"));
			parametrosDTO.setMagazinesController(propsServer.getProperty("controller.catalogos.magazines"));
			parametrosDTO.setTipoNotaController(propsServer.getProperty("controller.catalogos.tipo-nota"));
			parametrosDTO.setTipoVideoController(propsServer.getProperty("controller.catalogos.tipo-video"));
			
			
			parametrosDTO.setCms(propsServer.getProperty("controller.catalogos.cms"));
			parametrosDTO.setGrupoController(propsServer.getProperty("controller.catalogos.cms.grupo"));
			parametrosDTO.setUsuarioController(propsServer.getProperty("controller.catalogos.cms.usuario"));

			
						
		} catch (Exception ex) {
			parametrosDTO = new ParametrosDTO();
			logger.error("No se encontro el Archivo de propiedades: ", ex);			
			throw new Exception(ex.getMessage());
		}
		return parametrosDTO;
    }

}// FIN CLASE
