package com.example.demo.service;

import com.example.demo.model.Matricula;

public interface IMatriculaService {

	// crear
	public void insertarService(Matricula e);

	// read
	public Matricula buscarService(String numero);

	// update
	public void actualizarService(Matricula e);

	// delete
	public void eliminarService(String numero);

	void realizarMatricula(String cedula, String placa);

}
