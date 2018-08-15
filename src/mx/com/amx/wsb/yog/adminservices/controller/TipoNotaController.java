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
import mx.com.amx.wsb.yog.adminservices.model.TipoNota;
import mx.com.amx.wsb.yog.adminservices.ws.TipoNotaCallWS;



/**
 * @author  Jesus Armando Macias Benitez
 *
 */
@Controller
@RequestMapping("/catalogos/tipo-nota")
public class TipoNotaController {
	
	
	private static Logger logger = Logger.getLogger(TipoNotaController.class);
	
	@Autowired
	private TipoNotaCallWS tipoNotaCallWS;
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<TipoNota> findAll() throws ControllerException {
		logger.debug("--- findAll [ TipoNotaController ]-----");
		

	
		try {
			return tipoNotaCallWS.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findAll [ TipoNotaController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}
	
	
	@RequestMapping(value = "/{idTipoNota}/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public TipoNota findByIdTipoNota(@PathVariable String idTipoNota) throws ControllerException {
		logger.debug("--- findByIdTipoNota [ TipoNotaController ]-----");
		logger.debug("--- idTipoNota : "+idTipoNota+"-----");
		

	
		try {
			return tipoNotaCallWS.findById(idTipoNota);
		} catch (Exception e) {
			logger.error(" -- Error  findByIdTipoNota [ TipoNotaController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}

}
