package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Jefe;
import com.empresa.entity.Pais;
import com.empresa.service.JefeService;
import com.empresa.service.PaisService;
@Controller
public class UtilController {

	@Autowired
	private PaisService paisService;

	@Autowired
	private JefeService jefeService;
	

	@GetMapping("/listaPais")
	@ResponseBody
	public List<Pais> listaPais() {
		return paisService.listaTodos();
	}
	
	@GetMapping("/listaJefe")
	@ResponseBody
	public List<Jefe> listaJefe() {
		return jefeService.listaTodos();
	}

	
	
}
