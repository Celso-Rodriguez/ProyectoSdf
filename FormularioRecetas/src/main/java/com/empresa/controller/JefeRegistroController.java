package com.empresa.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.centroinformacion.util.AppSettings;
import com.empresa.entity.Jefe;
import com.empresa.entity.Usuario;
import com.empresa.service.JefeService;

import jakarta.servlet.http.HttpSession;

/**
 * 
 * @author Celso Rodriguez 14092023
 *
 */

@Controller
public class JefeRegistroController {

	@Autowired
	private JefeService jefeService;

	@PostMapping("/registraJefe")
	@ResponseBody
	public Map<?, ?> registra(Jefe obj, HttpSession session) {
		Usuario objUsuario = (Usuario) session.getAttribute("objUsuario");
		obj.setFechaActualizacion(new Date());
		obj.setFechaRegistro(new Date());

		obj.setEstado(AppSettings.ACTIVO);
		obj.setUsuarioRegistro(objUsuario);
		obj.setUsuarioActualiza(objUsuario);
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		Jefe objSalida = jefeService.insertaJefe(obj);
		if (objSalida == null) {
			map.put("MENSAJE", "Error en el Registro");
		} else {
			map.put("MENSAJE", "Registro Exitoso");
		}
		return map;
	}

	/*@GetMapping("/buscaPorNombresAutor")
	@ResponseBody
	public String validaNombres(String nombres) {
		List<Autor> lstAutor = autorService.buscaPorNombres(nombres);
		if (CollectionUtils.isEmpty(lstAutor)) {
			return "{\"valid\" : true }";
		} else {
			return "{\"valid\" : false }";
		}
	}

	@GetMapping("/buscaPorApellidosAutor")
	@ResponseBody
	public String validaApellidos(String apellidos) {
		List<Autor> lstAutor = autorService.buscaPorApellidos(apellidos);
		if (CollectionUtils.isEmpty(lstAutor)) {
			return "{\"valid\" : true }";
		} else {
			return "{\"valid\" : false }";
		}
	}
	
	@GetMapping("/buscaPorTelefonoAutor")
	@ResponseBody
	public String validaTelefono(String telefono) {
		List<Autor> lstAutor = autorService.buscaPorTelefono(telefono);
		if (CollectionUtils.isEmpty(lstAutor)) {
			return "{\"valid\" : true }";
		} else {
			return "{\"valid\" : false }";
		}
	}*/
	
	
	

}
