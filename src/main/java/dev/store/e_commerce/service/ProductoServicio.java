package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoServicio {

    // Crear o actualizar un producto
    Producto guardarProducto(Producto producto);

    // Obtener todos los productos
    List<Producto> obtenerTodosLosProductos();

    // Buscar un producto por su ID
    Optional<Producto> obtenerProductoPorId(Long id);

    // Eliminar un producto
    void eliminarProducto(Long id);

    // Buscar productos por nombre
    List<Producto> buscarPorNombre(String nombre);
}
