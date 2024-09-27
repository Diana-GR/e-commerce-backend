package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
    // Consultas adicionales para encontrar pedidos por usuario o sucursal
}
