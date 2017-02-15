package com.tata.entidades;

public class Asociado {

	private String nombre;
	private int numEmpleado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Asociado [nombre=" + nombre + ", numEmpleado=" + numEmpleado + "]";
	}

}
