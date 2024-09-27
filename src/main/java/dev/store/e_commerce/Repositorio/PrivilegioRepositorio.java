package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Privilegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegioRepositorio extends JpaRepository<Privilegio, Long> {
    // Consultas adicionales si necesitas buscar por nombre, por ejemplo
}
