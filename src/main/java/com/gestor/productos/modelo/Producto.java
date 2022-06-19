package com.gestor.productos.modelo;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private float precio;

	public Producto() {
		super();
	}

	public Producto(Integer id, String nombre, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
}
