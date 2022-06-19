package com.gestor.productos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.productos.modelo.Producto;

public interface RepositorioProducto extends JpaRepository<Producto, Integer> {

}
