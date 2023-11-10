package com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EnlaceController {

	//Login
	@GetMapping("/")
	public String verLogin() {	return "intranetLogin";  }
	
	@GetMapping("/verIntranetHome")
	public String verIntranetHome() {	return "intranetHome";  }

	//Registro
	@GetMapping("/verRegistroJefe")
	public String verRegistroJefe() {	return "intranetRegistroJefe";	}

		
	//Crud
	@GetMapping("/verCrudProducto")
	public String verCrudProducto() {	return "intranetCrudProducto";	}

	
	
	//Consulta
	@GetMapping("/verConsultaProducto")
	public String verConsultaProducto() {	return "intranetConsultaProducto";	}

	
	//Transaccion
	@GetMapping("/VerAsignacionRol")
	public String VerAsignacionRol() {	return "intranetTransaccionAsignacionRol";	}

	@GetMapping("/VerAsignacionOpcion")
	public String VerAsignacionOpcion() {	return "intranetTransaccionAsignacionOpcion";	}

	
}
