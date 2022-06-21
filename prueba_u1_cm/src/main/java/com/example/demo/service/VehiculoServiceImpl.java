package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository estuRepo;
	
	@Override
	public void insertarService(Vehiculo e) {
		// TODO Auto-generated method stub
		this.estuRepo.insertar(e);
	}

	@Override
	public Vehiculo buscarService(String apellido) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscar(apellido);
	}

	@Override
	public void actualizarService(Vehiculo e) {
		// TODO Auto-generated method stub
		this.estuRepo.actualizar(e);
	}

	@Override
	public void eliminarService(String cedula) {
		// TODO Auto-generated method stub
		this.estuRepo.eliminar(cedula);
	}

}
