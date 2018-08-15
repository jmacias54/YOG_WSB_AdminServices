/**
 * @author Jesus Armando Macias Benitez
 */
package mx.com.amx.wsb.yog.adminservices.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.amx.wsb.yog.adminservices.controller.exception.ControllerException;
import mx.com.amx.wsb.yog.adminservices.model.CMSGrupo;
import mx.com.amx.wsb.yog.adminservices.ws.CMSGrupoCallWS;


/**
 * @author  Jesus Armando Macias Benitez
 *
 */

@Controller
@RequestMapping("/catalogos/cms/grupo")
public class CMSGrupoController {
	
	private static Logger logger = Logger.getLogger(CMSGrupoController.class);
	
	@Autowired
	private CMSGrupoCallWS cmsGrupoCallWS;
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<CMSGrupo> findAll() throws ControllerException {
		logger.debug("--- findAll [ CMSGrupoController ]-----");
		

	
		try {
			return cmsGrupoCallWS.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findAll [ CMSGrupoController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}
	
	
	@RequestMapping(value = "/{idGrupo}/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public CMSGrupo findByIdCMSGrupo(@PathVariable String idGrupo) throws ControllerException {
		logger.debug("--- findByIdCMSGrupo [ CMSGrupoController ]-----");
		logger.debug("--- idGrupo : "+idGrupo+"-----");
		

	
		try {
			return  cmsGrupoCallWS.findById(idGrupo);
		} catch (Exception e) {
			logger.error(" -- Error  findByIdCMSGrupo [ CMSGrupoController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}

}
