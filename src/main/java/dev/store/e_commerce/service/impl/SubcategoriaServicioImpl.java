package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Subcategoria;
import dev.store.e_commerce.Repositorio.SubcategoriaRepositorio;
import dev.store.e_commerce.model.Sucursal;
import dev.store.e_commerce.service.SubcategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubcategoriaServicioImpl implements SubcategoriaServicio {

    private final SubcategoriaRepositorio subcategoriaRepositorio;

    @Autowired
    public SubcategoriaServicioImpl(SubcategoriaRepositorio subcategoriaRepositorio) {
        this.subcategoriaRepositorio = subcategoriaRepositorio;
    }

    @Override
    public Subcategoria guardarSubcategoria(Subcategoria subcategoria) {
        return subcategoriaRepositorio.save(subcategoria);
    }

    @Override
    public List<Subcategoria> obtenerTodasLasSubcategorias() {
        return subcategoriaRepositorio.findAll();
    }

    @Override
    public void eliminarSubcategoria(Long id) {
        subcategoriaRepositorio.deleteById(id);
    }
}