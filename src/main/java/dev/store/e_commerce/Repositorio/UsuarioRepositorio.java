package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Producto;
import dev.store.e_commerce.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    // Si quieres buscar por email
    Usuario findByEmail(String email);

}
