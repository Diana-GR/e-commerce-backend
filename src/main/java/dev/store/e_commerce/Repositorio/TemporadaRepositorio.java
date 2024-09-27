package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporadaRepositorio extends JpaRepository<Temporada, Long> {
    // Consultas personalizadas si lo necesitas
}
