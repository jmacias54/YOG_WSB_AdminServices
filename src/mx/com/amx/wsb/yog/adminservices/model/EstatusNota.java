package mx.com.amx.wsb.yog.adminservices.model;

import java.io.Serializable;

/**
 * The persistent class for the yog_ba_c_estatus_nota database table.
 * 
 */

public class EstatusNota implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fcIdEstatusNota;

	private String fcDescripcion;

	private int fiEstatus;

	public EstatusNota() {
	}

	public String getFcIdEstatusNota() {
		return this.fcIdEstatusNota;
	}

	public void setFcIdEstatusNota(String fcIdEstatusNota) {
		this.fcIdEstatusNota = fcIdEstatusNota;
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