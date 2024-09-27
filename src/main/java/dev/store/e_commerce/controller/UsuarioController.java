package dev.store.e_commerce.controller;

import dev.store.e_commerce.dto.UserDTO;
import dev.store.e_commerce.service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    // CU1 - Registrar Usuario
    @PostMapping("/registrar")
    public ResponseEntity<?> registrarUsuario(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(usuarioServicio.registrarUsuario(userDTO));
    }

    // CU2 - Inicio de Sesión
    @PostMapping("/login")
    public ResponseEntity<?> iniciarSesion(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(usuarioServicio.iniciarSesion(userDTO));
    }

    // CU3 - Cerrar Sesión
    @PostMapping("/logout")
    public ResponseEntity<?> cerrarSesion() {
        usuarioServicio.cerrarSesion();
        return ResponseEntity.ok("Sesión cerrada correctamente");
    }

    // CU4 - Gestionar Usuario (administrar, modificar, eliminar)
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerUsuario(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioServicio.obtenerUsuarioPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificarUsuario(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(usuarioServicio.modificarUsuario(id, userDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Long id) {
        usuarioServicio.eliminarUsuario(id);
        return ResponseEntity.ok("Usuario eliminado correctamente");
    }

    // CU22 - Administrar Datos Personales (modificación)
    @PutMapping("/datos-personales")
    public ResponseEntity<?> modificarDatosPersonales(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(usuarioServicio.modificarDatosPersonales(userDTO));
    }
}
