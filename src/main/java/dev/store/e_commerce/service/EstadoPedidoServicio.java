package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Estado_pedido;

import java.util.List;
import java.util.Optional;

public interface EstadoPedidoServicio {
    Estado_pedido guardarEstadoPedido(Estado_pedido estado_pedido);
    List<Estado_pedido> obtenerTodosLosEstadoPedido();
    Optional<Estado_pedido> obtenerEstadoPedidoPorId(Long id);
    void eliminarEstadoPedido(Long id);
}
