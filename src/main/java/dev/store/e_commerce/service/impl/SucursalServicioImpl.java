package dev.store.e_commerce.service.impl;

import dev.store.e_commerce.model.Sucursal;
import dev.store.e_commerce.Repositorio.SucursalRepositorio;
import dev.store.e_commerce.service.SucursalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalServicioImpl implements SucursalServicio {

    private final SucursalRepositorio sucursalRepositorio;

    @Autowired
    public SucursalServicioImpl(SucursalRepositorio sucursalRepositorio) {
        this.sucursalRepositorio = sucursalRepositorio;
    }

    @Override
    public Sucursal guardarSucursal(Sucursal sucursal) {
        return sucursalRepositorio.save(sucursal);
    }

    @Override
    public List<Sucursal> obtenerTodasLasSucursales() {
        return sucursalRepositorio.findAll();
    }

    @Override
    public Optional<Sucursal> obtenerSucursalPorId(Long id) {
        return sucursalRepositorio.findById(id);
    }

    @Override
    public void eliminarSucursal(Long id) {
        sucursalRepositorio.deleteById(id);
    }
}
