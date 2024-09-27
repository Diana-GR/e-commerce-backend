package dev.store.e_commerce.service;

import dev.store.e_commerce.model.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoServicio {
    Pedido guardarPedido(Pedido pedido);
    List<Pedido> obtenerTodosLosPedidos();
    Optional<Pedido> obtenerPedidoPorId(Long id);
    void eliminarPedido(Long id);
}
