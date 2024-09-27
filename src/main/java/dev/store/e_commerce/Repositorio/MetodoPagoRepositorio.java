package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Metodo_pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPagoRepositorio extends JpaRepository<Metodo_pago, Long> {
    // Consultas personalizadas si lo necesitas
}
