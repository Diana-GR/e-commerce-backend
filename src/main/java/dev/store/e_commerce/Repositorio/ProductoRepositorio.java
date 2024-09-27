package dev.store.e_commerce.Repositorio;

import dev.store.e_commerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    // Aquí puedes definir consultas personalizadas si las necesitas
    // Buscar productos por nombre
    List<Producto> findByNombre(String nombre);

    // Buscar productos por categoría (usando el objeto categoría)
    List<Producto> findBySubcategoria_Nombre(String subcategoriaNombre);
}