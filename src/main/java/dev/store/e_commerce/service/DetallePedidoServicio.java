package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Detalle_pedido;

import java.util.List;
import java.util.Optional;

public interface DetallePedidoServicio {
    Detalle_pedido guardarDetallePedido(Detalle_pedido detalle_pedido);
    List<Detalle_pedido> obtenerTodosLosDetallePedido();
    Optional<Detalle_pedido> obtenerDetallePedidoPorId(Long id);
    void eliminarDetallePedido(Long id);
}
