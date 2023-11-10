package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author CelsoRodriguez
 */

import com.empresa.entity.Jefe;


public interface JefeRepository extends JpaRepository<Jefe, Integer>{
	
	public abstract List<Jefe> findByOrderByApellidosAsc();
	
	@Query("select x from Jefe x where x.nombres =?1")
	public List<Jefe> buscaPorNombre(String nombres);
	
	@Query("select x from Jefe x where x.dni =?1")
	public List<Jefe> buscaPorDni(String dni);



}
