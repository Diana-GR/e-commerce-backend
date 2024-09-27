package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Detalle_pedido;
import dev.store.e_commerce.Repositorio.DetallePedidoRepositorio;
import dev.store.e_commerce.service.DetallePedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallePedidoServicioImpl implements DetallePedidoServicio {

    private final DetallePedidoRepositorio detallePedidoRepositorio;

    @Autowired
    public DetallePedidoServicioImpl(DetallePedidoRepositorio detallePedidoRepositorio) {
        this.detallePedidoRepositorio = detallePedidoRepositorio;
    }

    @Override
    public Detalle_pedido guardarDetallePedido(Detalle_pedido detalle_pedido) {
        return detallePedidoRepositorio.save(detalle_pedido);
    }

    @Override
    public List<Detalle_pedido> obtenerTodosLosDetallePedido() {
        return detallePedidoRepositorio.findAll();
    }

    @Override
    public Optional<Detalle_pedido> obtenerDetallePedidoPorId(Long id) {
        return detallePedidoRepositorio.findById(id);
    }

    @Override
    public void eliminarDetallePedido(Long id) {
        detallePedidoRepositorio.deleteById(id);
    }
}
