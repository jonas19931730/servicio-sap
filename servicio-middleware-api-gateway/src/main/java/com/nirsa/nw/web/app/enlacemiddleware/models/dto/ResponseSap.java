package com.nirsa.nw.web.app.enlacemiddleware.models.dto;

import java.io.Serializable;

public class ResponseSap implements Serializable {

	private Integer idsap;
	private Object data;

	public ResponseSap() {
	}

	public ResponseSap(Integer idsap) {
	
		this.idsap = idsap;
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
