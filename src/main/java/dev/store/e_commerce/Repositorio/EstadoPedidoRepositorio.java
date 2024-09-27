package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Estado_pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoPedidoRepositorio extends JpaRepository<Estado_pedido, Long> {
    // Consultas personalizadas si lo necesitas
}
