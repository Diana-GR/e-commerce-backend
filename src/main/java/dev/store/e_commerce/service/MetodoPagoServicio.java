package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Metodo_pago;

import java.util.List;
import java.util.Optional;

public interface MetodoPagoServicio {
    Metodo_pago guardarMetodoPago(Metodo_pago metodo_pago);
    List<Metodo_pago> obtenerTodosLosMetodoPago();
    Optional<Metodo_pago> obtenerMetodoPagoPorId(Long id);
    void eliminarMetodoPago(Long id);
}
