package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Marca;

import java.util.List;
import java.util.Optional;

public interface MarcaServicio {
    Marca guardarMarca(Marca marca);
    List<Marca> obtenerTodasLasMarca();
    Optional<Marca> obtenerMarcaPorId(Long id);
    void eliminarMarca(Long id);
}
