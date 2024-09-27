package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepositorio extends JpaRepository<Ciudad, Long> {
    // Consultas personalizadas si lo necesitas
}
