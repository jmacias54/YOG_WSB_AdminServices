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
import mx.com.amx.wsb.yog.adminservices.model.Categoria;
import mx.com.amx.wsb.yog.adminservices.ws.CategoriasCallWS;


/**
 * 
 * @author  Jesus Armando Macias Benitez
 *
 */


@Controller
@RequestMapping("/catalogos/categorias")
public class CategoriasController {
	/** The logger. */
	private static Logger logger = Logger.getLogger(CategoriasController.class);
	
	@Autowired
	private CategoriasCallWS categoriasCallWS;
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<Categoria> findAll() throws ControllerException {
		logger.debug("--- findAll [ CategoriaController ]-----");
		

	
		try {
			return categoriasCallWS.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findAll [ CategoriaController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}
	
	
	@RequestMapping(value = "/{idCategoria}/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public Categoria findByIdCategoria(@PathVariable String idCategoria) throws ControllerException {
		logger.debug("--- findByIdCategoria [ CategoriaController ]-----");
		logger.debug("--- idCategoria : "+idCategoria+"-----");
		

	
		try {
			return categoriasCallWS.findById(idCategoria);
		} catch (Exception e) {
			logger.error(" -- Error  findByIdCategoria [ CategoriaController ] :", e);
			throw new ControllerException(e.getMessage());
		}

		
	}

}
