package dev.store.e_commerce.controller;

import dev.store.e_commerce.dto.ProductoDTO;
import dev.store.e_commerce.service.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoServicio productoServicio;

    // CU7 - Registrar Producto
    @PostMapping("/registrar")
    public ResponseEntity<?> registrarProducto(@RequestBody ProductoDTO productoDTO) {
        return ResponseEntity.ok(productoServicio.registrarProducto(productoDTO));
    }

    // CU7 - Modificar Producto
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarProducto(@PathVariable Long id, @RequestBody ProductoDTO productoDTO) {
        return ResponseEntity.ok(productoServicio.modificarProducto(id, productoDTO));
    }

    // CU7 - Eliminar Producto
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable Long id) {
        productoServicio.eliminarProducto(id);
        return ResponseEntity.ok("Producto eliminado correctamente");
    }

    // CU17 - Filtrar Productos
    @GetMapping("/filtrar")
    public ResponseEntity<?> filtrarProductos(@RequestParam String filtro) {
        return ResponseEntity.ok(productoServicio.filtrarProductos(filtro));
    }

    // CU18 - Buscar Productos
    @GetMapping("/buscar")
    public ResponseEntity<?> buscarProductos(@RequestParam String nombre) {
        return ResponseEntity.ok(productoServicio.buscarProducto(nombre));
    }
}
