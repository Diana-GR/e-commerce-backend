package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Marca;
import dev.store.e_commerce.Repositorio.MarcaRepositorio;
import dev.store.e_commerce.service.MarcaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServicioImpl implements MarcaServicio {

    private final MarcaRepositorio marcaRepositorio;

    @Autowired
    public MarcaServicioImpl(MarcaRepositorio marcaRepositorio) {
        this.marcaRepositorio = marcaRepositorio;
    }

    @Override
    public Marca guardarMarca(Marca marca) {
        return marcaRepositorio.save(marca);
    }

    @Override
    public List<Marca> obtenerTodasLasMarca() {
        return marcaRepositorio.findAll();
    }

    @Override
    public Optional<Marca> obtenerMarcaPorId(Long id) {
        return marcaRepositorio.findById(id);
    }

    @Override
    public void eliminarMarca(Long id) {
        marcaRepositorio.deleteById(id);
    }
}
