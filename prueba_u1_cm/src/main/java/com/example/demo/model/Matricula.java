package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Matricula {
	
	private Vehiculo vehiculo;
	private Propietario propietario;
	private LocalDateTime fechaMatricula;
	private BigDecimal valor;
	
	//set y get
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	//to string
	@Override
	public String toString() {
		return "Matricula [" + vehiculo + ", " + propietario + ", fechaMatricula=" + fechaMatricula
				+ ", valor=" + valor + "]";
	}
	
}
