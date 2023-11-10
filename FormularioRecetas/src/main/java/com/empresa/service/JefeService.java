package com.empresa.service;

import java.util.List;

/**
 * @author CelsoRodriguez
 */


import com.empresa.entity.Jefe;

public interface JefeService {

	public abstract Jefe insertaJefe(Jefe obj);
	
	public abstract List<Jefe> listaTodos();
	public abstract List<Jefe> buscaPorNombre(String nombres);
	public abstract List<Jefe> buscaPorDni(String dni);

}
