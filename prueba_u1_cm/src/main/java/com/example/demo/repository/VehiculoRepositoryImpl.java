package com.example.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void insertar(Vehiculo vehi) {
		//Aqui se realiza la insercion
		System.out.println("se ha insertado el vehiculo "+vehi);
	}

	@Override
	public Vehiculo buscar(String placa) {
		
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Mazda");
		vehiculo.setPlaca("1233521");
		vehiculo.setPrecio(new BigDecimal(20000));
		vehiculo.setTipo("L");
		
		
		System.out.println("Se busca vehiculo por placa: "+placa);
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo vehi) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado "+vehi);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("se elimina al vehiculo por placa: "+placa);
	}

	
}
