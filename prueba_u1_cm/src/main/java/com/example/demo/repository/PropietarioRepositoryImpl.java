package com.example.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Vehiculo;
import com.example.demo.model.Propietario;
import com.example.demo.model.Matricula;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Insertando "+propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		Propietario pro=new Propietario();
		pro.setNombre("Carlos");
		pro.setApellido("Montalvo");
		pro.setCedula("456345345");
		pro.setFechaNacimiento(LocalDateTime.of(2000, 04, 01, 5, 30));
		
		
		System.out.println("buscando propietario por cedula: "+cedula);
		return pro;
	}

	@Override
	public void actualizar(Propietario propietario) {
		System.out.println("actualizando su propietario: "+propietario);
	}

	@Override
	public void eliminar(String cedula) {
		System.out.println("eliminando propietario de cedula "+cedula);
	}
}
