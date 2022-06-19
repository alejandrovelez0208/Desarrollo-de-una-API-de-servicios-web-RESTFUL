package com.gestor.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.productos.modelo.Producto;
import com.gestor.productos.repositorio.RepositorioProducto;

@Service
public class ServicioProducto {

	@Autowired
	private RepositorioProducto repositorioProducto;

	public List<Producto> listarProductos() {
		return repositorioProducto.findAll();
	}

	public void guardarProducto(Producto producto) {
		repositorioProducto.save(producto);
	}

	public Producto obtenerProducto(Integer id) {
		return repositorioProducto.findById(id).get();
	}

	public void eliminarProducto(Integer id) {
		repositorioProducto.deleteById(id);
	}
}
