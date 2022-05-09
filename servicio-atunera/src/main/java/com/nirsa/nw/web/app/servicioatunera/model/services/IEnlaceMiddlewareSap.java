package com.nirsa.nw.web.app.servicioatunera.model.services;

import com.nirsa.nw.web.app.servicioatunera.model.entity.RequestSap;
import com.nirsa.nw.web.app.servicioatunera.model.entity.ResponseSap;

public interface IEnlaceMiddlewareSap {
	public ResponseSap enviarProceso(RequestSap request);
}
