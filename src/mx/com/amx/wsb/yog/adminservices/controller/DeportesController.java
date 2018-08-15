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
import mx.com.amx.wsb.yog.adminservices.model.Deporte;
import mx.com.amx.wsb.yog.adminservices.ws.DeportesCallWS;



/**
 * @author  Jesus Armando Macias Benitez
 *
 */



@Controller
@RequestMapping("/catalogos/deportes")
public class DeportesController {
	
	
	private static Logger logger = Logger.getLogger(DeportesController.class);
	
	@Autowired
	private DeportesCallWS deportesCallWS;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<Deporte> findAll() throws ControllerException {
		logger.debug("--- findAll [ DeportesController ]-----");
		

	
		try {
			return deportesCallWS.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findAll [ DeportesController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}
	
	
	@RequestMapping(value = "/{idDeporte}/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<Deporte> findById(@PathVariable String idDeporte) throws ControllerException {
		logger.debug("--- findById [ DeportesController ]-----");
		logger.debug("--- idDeporte : "+idDeporte+"-----");
		

	
		try {
			return deportesCallWS.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findById [ DeportesController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}


}
