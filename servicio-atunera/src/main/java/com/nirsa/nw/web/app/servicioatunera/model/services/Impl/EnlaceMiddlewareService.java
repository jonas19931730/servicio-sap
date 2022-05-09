package com.nirsa.nw.web.app.servicioatunera.model.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirsa.nw.web.app.servicioatunera.clients.IEnlaceClient;
import com.nirsa.nw.web.app.servicioatunera.model.entity.RequestSap;
import com.nirsa.nw.web.app.servicioatunera.model.entity.ResponseSap;
import com.nirsa.nw.web.app.servicioatunera.model.services.IEnlaceMiddlewareSap;

@Service
public class EnlaceMiddlewareService implements IEnlaceMiddlewareSap {

	@Autowired
	IEnlaceClient clienteEnlace;

	@Override
	public ResponseSap enviarProceso(RequestSap request) {
		return clienteEnlace.enviarSap(request);
	}

}
