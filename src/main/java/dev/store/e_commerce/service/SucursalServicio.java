package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Sucursal;

import java.util.List;
import java.util.Optional;

public interface SucursalServicio {
    Sucursal guardarSucursal(Sucursal sucursal);
    List<Sucursal> obtenerTodasLasSucursales();
    Optional<Sucursal> obtenerSucursalPorId(Long id);
    void eliminarSucursal(Long id);
}
