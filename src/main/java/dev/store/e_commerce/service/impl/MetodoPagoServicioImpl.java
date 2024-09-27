package dev.store.e_commerce.service.impl;
import dev.store.e_commerce.model.Metodo_pago;
import dev.store.e_commerce.Repositorio.MetodoPagoRepositorio;
import dev.store.e_commerce.service.MetodoPagoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetodoPagoServicioImpl implements MetodoPagoServicio {

    private final MetodoPagoRepositorio metodoPagoRepositorio;

    @Autowired
    public MetodoPagoServicioImpl(MetodoPagoRepositorio pedidoRepositorio) {
        this.metodoPagoRepositorio = pedidoRepositorio;
    }

    @Override
    public Metodo_pago guardarMetodoPago(Metodo_pago metodo_pago) {
        return metodoPagoRepositorio.save(metodo_pago);
    }

    @Override
    public List<Metodo_pago> obtenerTodosLosMetodoPago() {
        return metodoPagoRepositorio.findAll();
    }

    @Override
    public Optional<Metodo_pago> obtenerMetodoPagoPorId(Long id) {
        return metodoPagoRepositorio.findById(id);
    }

    @Override
    public void eliminarMetodoPago(Long id) {
        metodoPagoRepositorio.deleteById(id);
    }
}
