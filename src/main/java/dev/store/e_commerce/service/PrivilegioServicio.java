package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Privilegio;

import java.util.List;
import java.util.Optional;

public interface PrivilegioServicio {
    Privilegio guardarPrivilegio(Privilegio privilegio);
    List<Privilegio> obtenerTodosLosPrivilegios();
    Optional<Privilegio> obtenerPrivilegioPorId(Long id);
    void eliminarPrivilegio(Long id);
}
