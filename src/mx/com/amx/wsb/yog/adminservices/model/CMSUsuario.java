package mx.com.amx.wsb.yog.adminservices.model;

import java.io.Serializable;


/**
 * The persistent class for the cms_c_usuario database table.
 * 
 */

public class CMSUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String fcCn;
	private String fcCorreo;
	private String fcTipoUsuario;
	private String fcUid;
	private int fiEstatus;

	public CMSUsuario() {
	}

	public String getFcCn() {
		return this.fcCn;
	}

	public void setFcCn(String fcCn) {
		this.fcCn = fcCn;
	}

	public String getFcCorreo() {
		return this.fcCorreo;
	}

	public void setFcCorreo(String fcCorreo) {
		this.fcCorreo = fcCorreo;
	}

	public String getFcTipoUsuario() {
		return this.fcTipoUsuario;
	}

	public void setFcTipoUsuario(String fcTipoUsuario) {
		this.fcTipoUsuario = fcTipoUsuario;
	}

	public String getFcUid() {
		return this.fcUid;
	}

	public void setFcUid(String fcUid) {
		this.fcUid = fcUid;
	}

	public int getFiEstatus() {
		return this.fiEstatus;
	}

	public void setFiEstatus(int fiEstatus) {
		this.fiEstatus = fiEstatus;
	}

}