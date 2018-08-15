/**
 * @author Jesus Armando Macias Benitez
 */
package mx.com.amx.wsb.yog.adminservices.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author  Jesus Armando Macias Benitez
 *
 */
public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String fcIdContenido;
	private String clRtfContenido;
	private String fcCn;
	private String fcDescripcion;
	private String fcEscribio;
	private String fcFriendlyUrl;
	private String fcFuente;
	private String fcIdCategoria;
	private String fcIdDeporte;
	private String fcIdEstatusNota;
	private String fcIdTipoNota;
	private String fcIdTipoVideo;
	private String fcIdVideoContent;
	private String fcIdVideoPlayer;
	private String fcImagenPie;
	private String fcImagenPrincipal;
	private String fcLugar;
	private String fcPcode;
	private String fcTitulo;
	private String fcVideoYoutube;
	private Timestamp fdFechaModificacion;
	private Timestamp fdFechaPublicacion;


	public Nota() {
	}


	public String getFcIdContenido() {
		return fcIdContenido;
	}


	public void setFcIdContenido(String fcIdContenido) {
		this.fcIdContenido = fcIdContenido;
	}


	public String getClRtfContenido() {
		return clRtfContenido;
	}


	public void setClRtfContenido(String clRtfContenido) {
		this.clRtfContenido = clRtfContenido;
	}


	public String getFcCn() {
		return fcCn;
	}


	public void setFcCn(String fcCn) {
		this.fcCn = fcCn;
	}


	public String getFcDescripcion() {
		return fcDescripcion;
	}


	public void setFcDescripcion(String fcDescripcion) {
		this.fcDescripcion = fcDescripcion;
	}


	public String getFcEscribio() {
		return fcEscribio;
	}


	public void setFcEscribio(String fcEscribio) {
		this.fcEscribio = fcEscribio;
	}


	public String getFcFriendlyUrl() {
		return fcFriendlyUrl;
	}


	public void setFcFriendlyUrl(String fcFriendlyUrl) {
		this.fcFriendlyUrl = fcFriendlyUrl;
	}


	public String getFcFuente() {
		return fcFuente;
	}


	public void setFcFuente(String fcFuente) {
		this.fcFuente = fcFuente;
	}


	public String getFcIdCategoria() {
		return fcIdCategoria;
	}


	public void setFcIdCategoria(String fcIdCategoria) {
		this.fcIdCategoria = fcIdCategoria;
	}


	public String getFcIdDeporte() {
		return fcIdDeporte;
	}


	public void setFcIdDeporte(String fcIdDeporte) {
		this.fcIdDeporte = fcIdDeporte;
	}


	public String getFcIdEstatusNota() {
		return fcIdEstatusNota;
	}


	public void setFcIdEstatusNota(String fcIdEstatusNota) {
		this.fcIdEstatusNota = fcIdEstatusNota;
	}


	public String getFcIdTipoNota() {
		return fcIdTipoNota;
	}


	public void setFcIdTipoNota(String fcIdTipoNota) {
		this.fcIdTipoNota = fcIdTipoNota;
	}


	public String getFcIdTipoVideo() {
		return fcIdTipoVideo;
	}


	public void setFcIdTipoVideo(String fcIdTipoVideo) {
		this.fcIdTipoVideo = fcIdTipoVideo;
	}


	public String getFcIdVideoContent() {
		return fcIdVideoContent;
	}


	public void setFcIdVideoContent(String fcIdVideoContent) {
		this.fcIdVideoContent = fcIdVideoContent;
	}


	public String getFcIdVideoPlayer() {
		return fcIdVideoPlayer;
	}


	public void setFcIdVideoPlayer(String fcIdVideoPlayer) {
		this.fcIdVideoPlayer = fcIdVideoPlayer;
	}


	public String getFcImagenPie() {
		return fcImagenPie;
	}


	public void setFcImagenPie(String fcImagenPie) {
		this.fcImagenPie = fcImagenPie;
	}


	public String getFcImagenPrincipal() {
		return fcImagenPrincipal;
	}


	public void setFcImagenPrincipal(String fcImagenPrincipal) {
		this.fcImagenPrincipal = fcImagenPrincipal;
	}


	public String getFcLugar() {
		return fcLugar;
	}


	public void setFcLugar(String fcLugar) {
		this.fcLugar = fcLugar;
	}


	public String getFcPcode() {
		return fcPcode;
	}


	public void setFcPcode(String fcPcode) {
		this.fcPcode = fcPcode;
	}


	public String getFcTitulo() {
		return fcTitulo;
	}


	public void setFcTitulo(String fcTitulo) {
		this.fcTitulo = fcTitulo;
	}


	public String getFcVideoYoutube() {
		return fcVideoYoutube;
	}


	public void setFcVideoYoutube(String fcVideoYoutube) {
		this.fcVideoYoutube = fcVideoYoutube;
	}


	public Timestamp getFdFechaModificacion() {
		return fdFechaModificacion;
	}


	public void setFdFechaModificacion(Timestamp fdFechaModificacion) {
		this.fdFechaModificacion = fdFechaModificacion;
	}


	public Timestamp getFdFechaPublicacion() {
		return fdFechaPublicacion;
	}


	public void setFdFechaPublicacion(Timestamp fdFechaPublicacion) {
		this.fdFechaPublicacion = fdFechaPublicacion;
	}


	@Override
	public String toString() {
		return "Nota [fcIdContenido=" + fcIdContenido + ", clRtfContenido=" + clRtfContenido + ", fcCn=" + fcCn
				+ ", fcDescripcion=" + fcDescripcion + ", fcEscribio=" + fcEscribio + ", fcFriendlyUrl=" + fcFriendlyUrl
				+ ", fcFuente=" + fcFuente + ", fcIdCategoria=" + fcIdCategoria + ", fcIdDeporte=" + fcIdDeporte
				+ ", fcIdEstatusNota=" + fcIdEstatusNota + ", fcIdTipoNota=" + fcIdTipoNota + ", fcIdTipoVideo="
				+ fcIdTipoVideo + ", fcIdVideoContent=" + fcIdVideoContent + ", fcIdVideoPlayer=" + fcIdVideoPlayer
				+ ", fcImagenPie=" + fcImagenPie + ", fcImagenPrincipal=" + fcImagenPrincipal + ", fcLugar=" + fcLugar
				+ ", fcPcode=" + fcPcode + ", fcTitulo=" + fcTitulo + ", fcVideoYoutube=" + fcVideoYoutube
				+ ", fdFechaModificacion=" + fdFechaModificacion + ", fdFechaPublicacion=" + fdFechaPublicacion + "]";
	}

	
	
	
	
}
