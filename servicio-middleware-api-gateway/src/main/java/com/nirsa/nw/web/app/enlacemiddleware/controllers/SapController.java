package com.nirsa.nw.web.app.enlacemiddleware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nirsa.nw.web.app.enlacemiddleware.models.dto.RequestSap;
import com.nirsa.nw.web.app.enlacemiddleware.models.dto.ResponseSap;
import com.nirsa.nw.web.app.enlacemiddleware.services.ISapService;

@RestController
public class SapController {

	@Autowired
	ISapService sapService;

	@PostMapping("/enviarSap")
	public ResponseSap enviarSap(@RequestBody RequestSap request) {
		return sapService.enviarProcesop(request);
	}
}
