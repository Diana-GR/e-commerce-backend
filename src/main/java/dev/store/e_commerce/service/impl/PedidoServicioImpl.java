package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Pedido;
import dev.store.e_commerce.Repositorio.PedidoRepositorio;
import dev.store.e_commerce.service.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServicioImpl implements PedidoServicio {

    private final PedidoRepositorio pedidoRepositorio;

    @Autowired
    public PedidoServicioImpl(PedidoRepositorio pedidoRepositorio) {
        this.pedidoRepositorio = pedidoRepositorio;
    }

    @Override
    public Pedido guardarPedido(Pedido pedido) {
        return pedidoRepositorio.save(pedido);
    }

    @Override
    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoRepositorio.findAll();
    }

    @Override
    public Optional<Pedido> obtenerPedidoPorId(Long id) {
        return pedidoRepositorio.findById(id);
    }

    @Override
    public void eliminarPedido(Long id) {
        pedidoRepositorio.deleteById(id);
    }
}
