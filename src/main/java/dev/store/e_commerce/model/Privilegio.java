package dev.store.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
@Table (name = "privilegio")

public class Privilegio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;

    @ManyToMany(mappedBy = "privilegios") // Relación bidireccional
    private Set<Rol> roles;
}
