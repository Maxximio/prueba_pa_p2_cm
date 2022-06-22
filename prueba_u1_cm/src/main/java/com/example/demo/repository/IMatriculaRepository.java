package com.example.demo.repository;

import java.math.BigDecimal;

import com.example.demo.model.Matricula;

public interface IMatriculaRepository {
	
	// crear
	public void insertar(Matricula matricula);

	// read
	public Matricula buscar(String numero);

	// update
	public void actualizar(Matricula matricula);

	// delete
	public void eliminar(String numero);

}
