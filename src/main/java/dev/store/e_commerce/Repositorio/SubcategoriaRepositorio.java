package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Subcategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoriaRepositorio extends JpaRepository<Subcategoria, Long> {
    // Consultas personalizadas si lo necesitas
}
