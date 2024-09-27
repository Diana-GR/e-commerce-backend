package dev.store.e_commerce.service.impl;

import dev.store.e_commerce.Repositorio.TemporadaRepositorio;
import dev.store.e_commerce.model.Temporada;
import dev.store.e_commerce.service.TemporadaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemporadaServicioImpl implements TemporadaServicio {

    private final TemporadaRepositorio temporadaRepositorio;

    @Autowired
    public TemporadaServicioImpl(TemporadaRepositorio temporadaRepositorio) {
        this.temporadaRepositorio = temporadaRepositorio;
    }

    @Override
    public Temporada guardarTemporada(Temporada temporada) {
        return temporadaRepositorio.save(temporada);
    }

    @Override
    public List<Temporada> obtenerTodasLasTemporadas() {
        return temporadaRepositorio.findAll();
    }

    @Override
    public Optional<Temporada> obtenerTemporadaPorId(Long id) {
        return temporadaRepositorio.findById(id);
    }

    @Override
    public void eliminarTemporada(Long id) {
        temporadaRepositorio.deleteById(id);
    }
}
