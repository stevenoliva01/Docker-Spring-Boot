package com.oliva.operaciones.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {
	
	@RequestMapping("/hola")
	public String bienvenida() {
		return "Hola mundo con edición2";
	}
}
