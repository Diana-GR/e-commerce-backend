package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Rol;

import java.util.List;
import java.util.Optional;

public interface RolServicio {
    Rol guardarRol(Rol rol);
    List<Rol> obtenerTodosLosRoles();
    Optional<Rol> obtenerRolPorId(Long id);
    void eliminarRol(Long id);
}
