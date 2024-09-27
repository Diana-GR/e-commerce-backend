package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long> {
    // Consultas personalizadas si lo necesitas
}
