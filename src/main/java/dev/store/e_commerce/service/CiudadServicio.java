package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Ciudad;

import java.util.List;
import java.util.Optional;

public interface CiudadServicio {
    Ciudad guardarCiudad(Ciudad ciudad);
    List<Ciudad> obtenerTodasLasCiudades();
    Optional<Ciudad> obtenerCiudadPorId(Long id);
    void eliminarCiudad(Long id);
}
