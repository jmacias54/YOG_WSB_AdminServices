package mx.com.amx.wsb.yog.adminservices.model;

import java.io.Serializable;


/**
 * The persistent class for the yog_ba_c_parametros database table.
 * 
 */

public class Parametro implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String fcIdParametro;
	private String fcDescription;
	private String fcValor;
	private int fiEstatus;

	public Parametro() {
	}

	public String getFcIdParametro() {
		return this.fcIdParametro;
	}

	public void setFcIdParametro(String fcIdParametro) {
		this.fcIdParametro = fcIdParametro;
	}

	public String getFcDescription() {
		return this.fcDescription;
	}

	public void setFcDescription(String fcDescription) {
		this.fcDescription = fcDescription;
	}

	public String getFcValor() {
		return this.fcValor;
	}

	public void setFcValor(String fcValor) {
		this.fcValor = fcValor;
	}

	public int getFiEstatus() {
		return this.fiEstatus;
	}

	public void setFiEstatus(int fiEstatus) {
		this.fiEstatus = fiEstatus;
	}

}