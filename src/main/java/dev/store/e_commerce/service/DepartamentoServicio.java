package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Departamento;

import java.util.List;
import java.util.Optional;

public interface DepartamentoServicio {
    Departamento guardarDepartamento(Departamento departamento);
    List<Departamento> obtenerTodosLosDepartamento();
    Optional<Departamento> obtenerDepartamentoPorId(Long id);
    void eliminarDepartamento(Long id);
}
