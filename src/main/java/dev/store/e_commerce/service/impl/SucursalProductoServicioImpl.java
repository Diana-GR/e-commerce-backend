package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Sucursal_producto;
import dev.store.e_commerce.Repositorio.SucursalProductoRepositorio;
import dev.store.e_commerce.service.SucursalProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SucursalProductoServicioImpl implements SucursalProductoServicio {

    private final SucursalProductoRepositorio sucursalProductoRepositorio;

    @Autowired
    public SucursalProductoServicioImpl(SucursalProductoRepositorio sucursalProductoRepositorio) {
        this.sucursalProductoRepositorio = sucursalProductoRepositorio;
    }

    @Override
    public Sucursal_producto guardarStockSucursalProducto(Sucursal_producto sucursalProducto) {
        return sucursalProductoRepositorio.save(sucursalProducto);
    }

    @Override
    public Optional<Sucursal_producto> obtenerStockSucursalProductoPorId(Long id) {
        return sucursalProductoRepositorio.findById(id);
    }

    @Override
    public void eliminarSucursalProducto(Long id) {
        sucursalProductoRepositorio.deleteById(id);
    }
}
