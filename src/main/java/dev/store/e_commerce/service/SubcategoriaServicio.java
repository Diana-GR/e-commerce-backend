package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Subcategoria;

import java.util.List;

public interface SubcategoriaServicio {
    Subcategoria guardarSubcategoria(Subcategoria subcategoria);
    List<Subcategoria> obtenerTodasLasSubcategorias();
    void eliminarSubcategoria(Long id);
}
