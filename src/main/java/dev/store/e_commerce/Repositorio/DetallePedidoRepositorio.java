package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Detalle_pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepositorio extends JpaRepository<Detalle_pedido, Long> {
    // Consultas para detalles de pedidos por producto o pedido
}
