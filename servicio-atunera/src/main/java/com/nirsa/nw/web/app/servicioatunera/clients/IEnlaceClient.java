package com.nirsa.nw.web.app.servicioatunera.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nirsa.nw.web.app.servicioatunera.model.entity.RequestSap;
import com.nirsa.nw.web.app.servicioatunera.model.entity.ResponseSap;

@FeignClient(name="servicio-enlace")
public interface IEnlaceClient {

	@PostMapping("/enviarSap")
	public ResponseSap enviarSap(@RequestBody RequestSap request);
}
