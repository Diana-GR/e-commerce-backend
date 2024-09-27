package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Ciudad;
import dev.store.e_commerce.Repositorio.CiudadRepositorio;
import dev.store.e_commerce.service.CiudadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadServicioImpl implements CiudadServicio {

    private final CiudadRepositorio ciudadRepositorio;

    @Autowired
    public CiudadServicioImpl(CiudadRepositorio ciudadRepositorio) {
        this.ciudadRepositorio = ciudadRepositorio;
    }

    @Override
    public Ciudad guardarCiudad(Ciudad ciudad) {
        return ciudadRepositorio.save(ciudad);
    }

    @Override
    public List<Ciudad> obtenerTodasLasCiudades() {
        return ciudadRepositorio.findAll();
    }

    @Override
    public Optional<Ciudad> obtenerCiudadPorId(Long id) {
        return ciudadRepositorio.findById(id);
    }

    @Override
    public void eliminarCiudad(Long id) {
        ciudadRepositorio.deleteById(id);
    }
}
