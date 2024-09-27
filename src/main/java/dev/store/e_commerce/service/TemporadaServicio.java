package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Temporada;

import java.util.List;
import java.util.Optional;

public interface TemporadaServicio {
    Temporada guardarTemporada(Temporada temporada);
    List<Temporada> obtenerTodasLasTemporadas();
    Optional<Temporada> obtenerTemporadaPorId(Long id);
    void eliminarTemporada(Long id);
}
