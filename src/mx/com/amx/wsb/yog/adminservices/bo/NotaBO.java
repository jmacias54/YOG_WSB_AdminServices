/**
 * @author Jesus Armando Macias Benitez
 */
package mx.com.amx.wsb.yog.adminservices.bo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.com.amx.wsb.yog.adminservices.bo.exception.BOException;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsFilterRequest;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsRequest;
import mx.com.amx.wsb.yog.adminservices.model.request.ItemsRequestByTitle;
import mx.com.amx.wsb.yog.adminservices.model.response.ItemsResponse;
import mx.com.amx.wsb.yog.adminservices.utils.Constants;
import mx.com.amx.wsb.yog.adminservices.ws.HNotaCallWS;
import mx.com.amx.wsb.yog.adminservices.ws.NNotaCallWS;

/**
 * @author  Jesus Armando Macias Benitez
 *
 */
public class NotaBO {
	private static Logger logger = Logger.getLogger(NotaBO.class);
	

	
	@Autowired
	private HNotaCallWS hNotaCallWS;
	@Autowired
	private NNotaCallWS nNotaCallWS;
	
	
	public List<ItemsResponse> getListItemsByFilter( ItemsFilterRequest req) throws BOException {
		logger.info("--- get_list_items_filter  [ NotaBO ] ----");
	
		List<ItemsResponse> lista = null;

		try {
			
			
			if(req.getStatus().equals(Constants.STATUS_PUBLICADO)) {
				lista = nNotaCallWS.getListItemsByFilter(req);
			}else  {
				lista = hNotaCallWS.getListItemsByFilter(req);
			}

			

			
		} catch (Exception e) {
			logger.error("---Error get_list_items_filter  [ NotaBO ] :" + e.getMessage());
			throw new BOException(e.getMessage());
		}

		return lista;
	}


	public List<ItemsResponse> getListItems( ItemsRequest req) throws BOException {
		logger.info("--- get_list_items [ NotaBO ] ----");
		
		List<ItemsResponse> lista = null;

		try {
			
			if(req.getStatus().equals(Constants.STATUS_PUBLICADO)) {
				lista = nNotaCallWS.getListItems(req);
			}else  {
				lista = hNotaCallWS.getListItems(req);
			}

			
		
		} catch (Exception e) {

			logger.error("---Error get_list_items  [ NotaBO ] :" + e.getMessage());
			throw new BOException(e.getMessage());
		}

		return lista;
	}

	
	public List<ItemsResponse> getListItemsByTitle( ItemsRequestByTitle req) throws BOException {
		logger.info("--- getListItemsByTitle [ NotaBO ] ----");
		
		List<ItemsResponse> lista = null;

		try {
			
			if(req.getStatus().equals(Constants.STATUS_PUBLICADO)) {
				lista = nNotaCallWS.getListItemsByTitle(req);
			}else  {
				lista = hNotaCallWS.getListItemsByTitle(req);
			}

			
			
		} catch (Exception e) {

			logger.error("---Error getListItemsByTitle  [ NotaBO ] :" + e.getMessage());
			throw new BOException(e.getMessage());
		}

		return lista;
	}

}
