package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepositorio extends JpaRepository<Sucursal, Long> {
    // Consultas personalizadas
}

