package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Usuario;

import java.util.Optional;

public interface UsuarioServicio {
    Usuario guardarUsuario(Usuario usuario);
    Optional<Usuario> obtenerUsuarioPorId(Long id);
    Usuario buscarPorEmail(String email);
    void eliminarUsuario(Long id);
}
