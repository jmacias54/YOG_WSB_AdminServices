package mx.com.amx.wsb.yog.adminservices.model;

import java.io.Serializable;


/**
 * The persistent class for the yog_ba_c_tipo_nota database table.
 * 
 */

public class TipoNota implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fcIdTipoNota;
	private String fcDescripcion;
	private int fiEstatus;

	public TipoNota() {
	}

	public String getFcIdTipoNota() {
		return this.fcIdTipoNota;
	}

	public void setFcIdTipoNota(String fcIdTipoNota) {
		this.fcIdTipoNota = fcIdTipoNota;
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