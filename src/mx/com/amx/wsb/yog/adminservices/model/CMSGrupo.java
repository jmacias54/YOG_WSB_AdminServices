package mx.com.amx.wsb.yog.adminservices.model;

import java.io.Serializable;


/**
 * The persistent class for the cms_c_grupo database table.
 * 
 */

public class CMSGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String fcIdGrupo;
	private String fcDescripcion;
	private int fiEstatus;

	public CMSGrupo() {
	}

	public String getFcIdGrupo() {
		return this.fcIdGrupo;
	}

	public void setFcIdGrupo(String fcIdGrupo) {
		this.fcIdGrupo = fcIdGrupo;
	}

	public String getFcDescripcion() {
		return this.fcDescripcion;
	}

	public void setFcDescripcion(String fcDescripcion) {
		this.fcDescripcion = fcDescripcion;
	}

	public int getFiEstatus() {
		return this.fiEstatus;
	}

	public void setFiEstatus(int fiEstatus) {
		this.fiEstatus = fiEstatus;
	}

}