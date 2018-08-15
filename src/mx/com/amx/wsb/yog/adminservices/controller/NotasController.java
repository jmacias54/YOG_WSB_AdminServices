/**
 * @author Jesus Armando Macias Benitez
 */
package mx.com.amx.wsb.yog.adminservices.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.amx.wsb.yog.adminservices.bo.NotaBO;
import mx.com.amx.wsb.yog.adminservices.controller.exception.ControllerException;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsFilterRequest;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsRequest;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsRequestByTitle;
import mx.com.amx.wsb.yog.adminservices.model.response.ItemsResponse;


/**
 * @author  Jesus Armando Macias Benitez
 *
 */


@Controller
@RequestMapping("/notas")
public class NotasController {
	
	private static Logger logger = Logger.getLogger(NotasController.class);
	
	
	
	@Autowired
	private NotaBO notaBO;
	
	
	@RequestMapping(value = "/get_list_items_filter", method = RequestMethod.POST, headers = {"Content-type=application/json" })
	@ResponseBody
	public List<ItemsResponse> getListItemsByFilter(@RequestBody ItemsFilterRequest req) throws ControllerException {
		logger.info("--- get_list_items_filter  [ NotasController ] ----");
		List<ItemsResponse> lista = null;

		try {
			lista =  notaBO.getListItemsByFilter(req);
		} catch (Exception e) {
			logger.error("---Error get_list_items_filter  [ NotasController ] :" + e.getMessage());
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}

	@RequestMapping(value = "/get_list_items", method = RequestMethod.POST, headers = {"Content-type=application/json" })
	@ResponseBody
	public List<ItemsResponse> getListItems(@RequestBody ItemsRequest req) throws ControllerException {
		logger.info("--- get_list_items [ NotasController ] ----");
		List<ItemsResponse> lista = null;

		try {
			lista = notaBO.getListItems(req);
		} catch (Exception e) {

			logger.error("---Error get_list_items  [ NotasController ] :" + e.getMessage());
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}

	@RequestMapping(value = "/get_list_items_search", method = RequestMethod.POST, headers = {"Content-type=application/json" })
	@ResponseBody
	public List<ItemsResponse> getListItemsByTitle(@RequestBody ItemsRequestByTitle req) throws ControllerException {
		logger.info("--- get_list_items [ NotasController ] ----");
		List<ItemsResponse> lista = null;

		try {
			lista = notaBO.getListItemsByTitle(req);
		} catch (Exception e) {

			logger.error("---Error get_list_items  [ NotasController ] :" + e.getMessage());
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}
	
	
	

}
