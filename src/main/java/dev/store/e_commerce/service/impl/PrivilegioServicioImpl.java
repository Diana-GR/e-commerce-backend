package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Privilegio;
import dev.store.e_commerce.Repositorio.PrivilegioRepositorio;
import dev.store.e_commerce.service.PrivilegioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrivilegioServicioImpl implements PrivilegioServicio {

    private final PrivilegioRepositorio privilegioRepositorio;

    @Autowired
    public PrivilegioServicioImpl(PrivilegioRepositorio privilegioRepositorio) {
        this.privilegioRepositorio = privilegioRepositorio;
    }

    @Override
    public Privilegio guardarPrivilegio(Privilegio privilegio) {
        return privilegioRepositorio.save(privilegio);
    }

    @Override
    public List<Privilegio> obtenerTodosLosPrivilegios() {
        return privilegioRepositorio.findAll();
    }

    @Override
    public Optional<Privilegio> obtenerPrivilegioPorId(Long id) {
        return privilegioRepositorio.findById(id);
    }

    @Override
    public void eliminarPrivilegio(Long id) {
        privilegioRepositorio.deleteById(id);
    }
}
