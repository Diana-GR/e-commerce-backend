package dev.store.e_commerce.controller;

import dev.store.e_commerce.dto.RolDTO;
import dev.store.e_commerce.model.Rol;
import dev.store.e_commerce.service.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolServicio rolServicio;

    // CU5 - Crear Rol
    @PostMapping("/crear")
    public ResponseEntity<?> crearRol(@RequestBody RolDTO rolDTO) {
        return ResponseEntity.ok(rolServicio.crearRol(rolDTO));
    }

    // CU5 - Modificar Rol
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarRol(@PathVariable Long id, @RequestBody RolDTO rolDTO) {
        return ResponseEntity.ok(rolServicio.modificarRol(id, rolDTO));
    }

    // CU5 - Eliminar Rol
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarRol(@PathVariable Long id) {
        rolServicio.eliminarRol(id);
        return ResponseEntity.ok("Rol eliminado correctamente");
    }

    // CU6 - Administrar Privilegios (modificación de los privilegios de un rol)
    @PostMapping("/{id}/privilegios")
    public ResponseEntity<?> administrarPrivilegios(@PathVariable Long id, @RequestBody List<Long> privilegios) {
        return ResponseEntity.ok(rolServicio.administrarPrivilegios(id, privilegios));
    }
}
