package mx.com.amx.wsb.yog.adminservices.dto;

import java.io.Serializable;

public class ParametrosDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	private String ambiente;
	private String url;
	
	
	
	private String nnotaController;
	private String hnotaController;
	
	private String catalogos;
	private String categoriaController;
	private String deportesController;
	private String estatusNotaController;
	private String magazinesController;
	private String tipoNotaController;
	private String tipoVideoController;
	
	private String cms;
	private String grupoController;
	private String usuarioController;

	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNnotaController() {
		return nnotaController;
	}
	public void setNnotaController(String nnotaController) {
		this.nnotaController = nnotaController;
	}
	public String getHnotaController() {
		return hnotaController;
	}
	public void setHnotaController(String hnotaController) {
		this.hnotaController = hnotaController;
	}
	public String getCatalogos() {
		return catalogos;
	}
	public void setCatalogos(String catalogos) {
		this.catalogos = catalogos;
	}
	public String getCategoriaController() {
		return categoriaController;
	}
	public void setCategoriaController(String categoriaController) {
		this.categoriaController = categoriaController;
	}
	public String getDeportesController() {
		return deportesController;
	}
	public void setDeportesController(String deportesController) {
		this.deportesController = deportesController;
	}
	public String getEstatusNotaController() {
		return estatusNotaController;
	}
	public void setEstatusNotaController(String estatusNotaController) {
		this.estatusNotaController = estatusNotaController;
	}
	public String getMagazinesController() {
		return magazinesController;
	}
	public void setMagazinesController(String magazinesController) {
		this.magazinesController = magazinesController;
	}
	public String getTipoNotaController() {
		return tipoNotaController;
	}
	public void setTipoNotaController(String tipoNotaController) {
		this.tipoNotaController = tipoNotaController;
	}
	public String getTipoVideoController() {
		return tipoVideoController;
	}
	public void setTipoVideoController(String tipoVideoController) {
		this.tipoVideoController = tipoVideoController;
	}
	public String getCms() {
		return cms;
	}
	public void setCms(String cms) {
		this.cms = cms;
	}
	public String getGrupoController() {
		return grupoController;
	}
	public void setGrupoController(String grupoController) {
		this.grupoController = grupoController;
	}
	public String getUsuarioController() {
		return usuarioController;
	}
	public void setUsuarioController(String usuarioController) {
		this.usuarioController = usuarioController;
	}
	
	
	
	@Override
	public String toString() {
		return "ParametrosDTO [ambiente=" + ambiente + ", url=" + url + ", nnotaController="
				+ nnotaController + ", hnotaController=" + hnotaController + ", catalogos=" + catalogos
				+ ", categoriaController=" + categoriaController + ", deportesController=" + deportesController
				+ ", estatusNotaController=" + estatusNotaController + ", magazinesController=" + magazinesController
				+ ", tipoNotaController=" + tipoNotaController + ", tipoVideoController=" + tipoVideoController
				+ ", cms=" + cms + ", grupoController=" + grupoController + ", usuarioController=" + usuarioController
				+ "]";
	}


	
	
	
	
	

}
