package com.nirsa.nw.web.app.servicioatunera.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirsa.nw.web.app.servicioatunera.model.entity.RequestSap;
import com.nirsa.nw.web.app.servicioatunera.model.services.IEnlaceMiddlewareSap;

@RequestMapping("/sap")
@RestController
public class EscanearPeticionesSapController {
	
	@Autowired
	IEnlaceMiddlewareSap enlace;
	
	@PostMapping("/enviar")
	public Object enviar(@RequestBody RequestSap request) {
		return enlace.enviarProceso(request);
	}
	
}
