package com.nirsa.nw.web.app.enlacemiddleware.models.dto;

import java.io.Serializable;

public class RequestSap implements Serializable {

	private String nombreServicio;

	private String proceso;

	private Object data;

	public RequestSap() {

	}

	public RequestSap(String nombreServicio, String proceso, Object data) {
		this.nombreServicio = nombreServicio;
		this.proceso = proceso;
		this.data = data;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public String getProceso() {
		return proceso;
	}

	public void setProceso(String proceso) {
		this.proceso = proceso;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
