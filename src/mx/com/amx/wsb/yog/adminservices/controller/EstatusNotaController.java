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
import mx.com.amx.wsb.yog.adminservices.model.EstatusNota;
import mx.com.amx.wsb.yog.adminservices.ws.EstatusNotaCallWS;

/**
 * @author  Jesus Armando Macias Benitez
 *
 */

@Controller
@RequestMapping("/catalogos/estatus-nota")
public class EstatusNotaController {
	
	
	private static Logger logger = Logger.getLogger(EstatusNotaController.class);
	
	@Autowired
	private EstatusNotaCallWS estatusNotaCallWS;
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<EstatusNota> findAll() throws ControllerException {
		logger.debug("--- findAll [ EstatusNotaController ]-----");
		

	
		try {
			return estatusNotaCallWS.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findAll [ EstatusNotaController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}
	
	
	@RequestMapping(value = "/{idEstatusNota}/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public EstatusNota findByIdEstatusNota(@PathVariable String idEstatusNota) throws ControllerException {
		logger.debug("--- findByIdEstatusNota [ EstatusNotaController ]-----");
		logger.debug("--- idEstatusNota : "+idEstatusNota+"-----");
		

	
		try {
			return estatusNotaCallWS.findById(idEstatusNota);
		} catch (Exception e) {
			logger.error(" -- Error  findByIdEstatusNota [ EstatusNotaController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}

}
