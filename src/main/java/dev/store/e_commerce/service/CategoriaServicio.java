package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaServicio {
    Categoria guardarCategoria(Categoria categoria);
    List<Categoria> obtenerTodasLasCategorias();
    Optional<Categoria> obtenerCategoriaPorId(Long id);
    void eliminarCategoria(Long id);
}
