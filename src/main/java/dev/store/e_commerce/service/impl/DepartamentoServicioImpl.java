package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Departamento;
import dev.store.e_commerce.Repositorio.DepartamentoRepositorio;
import dev.store.e_commerce.service.DepartamentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServicioImpl implements DepartamentoServicio {

    private final DepartamentoRepositorio departamentoRepositorio;

    @Autowired
    public DepartamentoServicioImpl(DepartamentoRepositorio departamentoRepositorio) {
        this.departamentoRepositorio = departamentoRepositorio;
    }

    @Override
    public Departamento guardarDepartamento(Departamento departamento) {
        return departamentoRepositorio.save(departamento);
    }

    @Override
    public List<Departamento> obtenerTodosLosDepartamento() {
        return departamentoRepositorio.findAll();
    }

    @Override
    public Optional<Departamento> obtenerDepartamentoPorId(Long id) {
        return departamentoRepositorio.findById(id);
    }

    @Override
    public void eliminarDepartamento(Long id) {
        departamentoRepositorio.deleteById(id);
    }
}
