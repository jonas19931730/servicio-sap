package com.nirsa.nw.web.app.enlacemiddleware.services;

import java.util.List;

import com.nirsa.nw.web.app.enlacemiddleware.models.dto.RequestSap;
import com.nirsa.nw.web.app.enlacemiddleware.models.dto.ResponseSap;

public interface ISapService {

	public void enviarProceso(RequestSap request);
	
	// para prueba
	public ResponseSap enviarProcesop(RequestSap request);
	
	public void enviarListaProcesos(List<RequestSap> listado);
	
	public List<ResponseSap> recibirProcesados();
}
