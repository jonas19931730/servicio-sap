package com.nirsa.nw.web.app.enlacemiddleware.services;

import java.util.Base64;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nirsa.nw.web.app.enlacemiddleware.models.dto.RequestSap;
import com.nirsa.nw.web.app.enlacemiddleware.models.dto.ResponseSap;
import com.nirsa.nw.web.app.enlacemiddleware.utils.ValoresConstantes;

@Service
public class SapServiceImpl implements ISapService {
	
	@Autowired
	private RestTemplate middlewareRest;

	@Override
	public void enviarProceso(RequestSap request) {
			
	}

	@Override
	public void enviarListaProcesos(List<RequestSap> listado) {
		
		
	}
	@Override
	public List<ResponseSap> recibirProcesados() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResponseSap enviarProcesop(RequestSap request) {
		
		/*
		
		 String authStr = "S0024205680:NJ8!=#gpZi";
		 String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
		 
		 HttpHeaders headers = new HttpHeaders();
		 headers.setContentType(MediaType.APPLICATION_JSON);
		 headers.add("Authorization", "Basic " + base64Creds);
		 HttpEntity requestSap = new HttpEntity(request.getData(),headers);
	
		//Object obj = middlewareRest.postForObject(ValoresConstantes.urlEnlace, requestSap, Object.class);
		
		Object obj2 = middlewareRest.postForEntity(ValoresConstantes.urlEnlace, requestSap, Object.class);
			*/
		ResponseSap response = new ResponseSap();
		Random random = new Random();
		
		Integer idsapGenerado = random.nextInt(100)*2;
		response.setIdsap(idsapGenerado);
		//response.setData(obj2);
		response.setData(request.getData());
		return response;
		
	}
	
	
}
