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
import mx.com.amx.wsb.yog.adminservices.model.CMSUsuario;
import mx.com.amx.wsb.yog.adminservices.ws.CMSUsuarioCallWS;



/**
 * @author  Jesus Armando Macias Benitez
 *
 */

@Controller
@RequestMapping("/catalogos/cms/usuario")
public class CMSUsuarioController {
	
	private static Logger logger = Logger.getLogger(CMSUsuarioController.class);
	
	@Autowired
	private CMSUsuarioCallWS cmsUsuarioCallWS;
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<CMSUsuario> findAll() throws ControllerException {
		logger.debug("--- findAll [ CMSUsuarioController ]-----");
		

	
		try {
			return cmsUsuarioCallWS.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findAll [ CMSUsuarioController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}
	
	
	@RequestMapping(value = "/{cn}/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public CMSUsuario findByCN(@PathVariable String cn) throws ControllerException {
		logger.debug("--- findByCN [ CMSUsuarioController ]-----");
		logger.debug("--- cn : "+cn+"-----");
		

	
		try {
			return  cmsUsuarioCallWS.findByCN(cn);
		} catch (Exception e) {
			logger.error(" -- Error  findByCN [ CMSUsuarioController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}

}
