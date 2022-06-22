package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vehiculo;
import com.example.demo.model.Matricula;
import com.example.demo.model.Propietario;
import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;

@Service
@Qualifier("Pesado")
public class MatriculaPesadoServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriRepo;
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
//	@Override
//	public void realizarMatricula(String cedula,String placa) {
//		System.out.println();
//		System.out.println("Generando Matricula...");
//		
//		BigDecimal valorPagar=null;
//		
//		Vehiculo veh=new Vehiculo();
//		veh=vehiculoRepository.buscar(placa);
//		
//		Propietario pro=new Propietario();
//		pro=propietarioRepository.buscar(cedula);
//		
//		Matricula mat=new Matricula();
//		mat.setFechaMatricula(LocalDateTime.now());
//		mat.setPropietario(pro);
//		mat.setVehiculo(veh);
//		
//		if(veh.getTipo()=="P") {
//			valorPagar=veh.getPrecio().multiply(new BigDecimal(0.15));
//
//		}else {
//			valorPagar=veh.getPrecio().multiply(new BigDecimal(0.1));
//		}
//		
//		int trans=valorPagar.intValue();
//		
//		if(trans>2000) {
//			BigDecimal descuento=valorPagar.multiply(new BigDecimal(0.07));
//			valorPagar=valorPagar.subtract(descuento);
//		}
//		
//		mat.setValor(valorPagar);
//		
//		matriRepo.insertar(mat);
//	}

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		return precio.multiply(new BigDecimal(0.15));
	}

}
