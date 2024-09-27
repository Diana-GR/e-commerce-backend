package dev.store.e_commerce.Repositorio;
import dev.store.e_commerce.model.Sucursal_producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface SucursalProductoRepositorio extends JpaRepository<Sucursal_producto, Long> {
    // Consultas personalizadas para encontrar el stock por sucursal o producto
}

