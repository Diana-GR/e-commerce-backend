package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Long> {
    // Consultas personalizadas si lo necesitas
}
