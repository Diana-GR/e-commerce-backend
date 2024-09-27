package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Estado_pedido;
import dev.store.e_commerce.Repositorio.EstadoPedidoRepositorio;
import dev.store.e_commerce.service.EstadoPedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoPedidoServicioImpl implements EstadoPedidoServicio {

    private final EstadoPedidoRepositorio estadoPedidoRepositorio;

    @Autowired
    public EstadoPedidoServicioImpl(EstadoPedidoRepositorio estadoPedidoRepositorio) {
        this.estadoPedidoRepositorio = estadoPedidoRepositorio;
    }

    @Override
    public Estado_pedido guardarEstadoPedido(Estado_pedido estado_pedido) {
        return estadoPedidoRepositorio.save(estado_pedido);
    }

    @Override
    public List<Estado_pedido> obtenerTodosLosEstadoPedido() {
        return estadoPedidoRepositorio.findAll();
    }

    @Override
    public Optional<Estado_pedido> obtenerEstadoPedidoPorId(Long id) {
        return estadoPedidoRepositorio.findById(id);
    }

    @Override
    public void eliminarEstadoPedido(Long id) {
        estadoPedidoRepositorio.deleteById(id);
    }
}
