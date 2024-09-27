package dev.store.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String email;
    private String password;
    private String direccion;

    @ManyToOne
    @JoinColumn(name="id_rol")

    private Rol id_rol ;
}
