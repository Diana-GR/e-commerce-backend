package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Long> {
    // Puedes agregar consultas para encontrar roles por nombre si lo necesitas
}
