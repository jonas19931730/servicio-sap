package com.nirsa.nw.web.app.servicioatunera.model.entity;

import java.io.Serializable;

public class ResponseSap implements Serializable {

	private Integer idsap;
	private Object data;

	
	public ResponseSap() {}
	

	public ResponseSap(Integer idsap, String descripcion, Object data) {
		super();
		this.idsap = idsap;
		this.data = data;
	}


	public Integer getIdsap() {
		return idsap;
	}

	public void setIdsap(Integer idsap) {
		this.idsap = idsap;
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
