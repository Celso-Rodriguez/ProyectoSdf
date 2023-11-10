
package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Jefe;
import com.empresa.repository.JefeRepository;

@Service
public class JefeServiceImp implements JefeService {

	@Autowired
	private JefeRepository repository;

	@Override
	public Jefe insertaJefe(Jefe obj) {
		return repository.save(obj);
	}
	
	@Override
	public List<Jefe> listaTodos() {
		return repository.findByOrderByApellidosAsc();
	}

	@Override
	public List<Jefe> buscaPorNombre(String nombres) {
		return repository.buscaPorNombre(nombres);
	}
	@Override
	public List<Jefe> buscaPorDni(String dni) {
		return repository.buscaPorDni(dni);
	}

	
}
