package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Sucursal_producto;

import java.util.Optional;

public interface SucursalProductoServicio {
    Sucursal_producto guardarStockSucursalProducto(Sucursal_producto sucursal_producto);
    Optional<Sucursal_producto> obtenerStockSucursalProductoPorId(Long id);
    void eliminarSucursalProducto(Long id);
}
