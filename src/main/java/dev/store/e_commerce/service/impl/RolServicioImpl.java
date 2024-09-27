package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Rol;
import dev.store.e_commerce.Repositorio.RolRepositorio;
import dev.store.e_commerce.service.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServicioImpl implements RolServicio {

    private final RolRepositorio rolRepositorio;

    @Autowired
    public RolServicioImpl(RolRepositorio rolRepositorio) {
        this.rolRepositorio = rolRepositorio;
    }

    @Override
    public Rol guardarRol(Rol rol) {
        return rolRepositorio.save(rol);
    }

    @Override
    public List<Rol> obtenerTodosLosRoles() {
        return rolRepositorio.findAll();
    }

    @Override
    public Optional<Rol> obtenerRolPorId(Long id) {
        return rolRepositorio.findById(id);
    }

    @Override
    public void eliminarRol(Long id) {
        rolRepositorio.deleteById(id);
    }
}
