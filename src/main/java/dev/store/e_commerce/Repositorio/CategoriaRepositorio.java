package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
    // Consultas personalizadas si lo necesitas
}
