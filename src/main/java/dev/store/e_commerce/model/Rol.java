package dev.store.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data//almacena y genera automatic los get y set
@Table (name = "rol")//da el nombre a la tabla

public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //hac q las tuplas se generen incremental
    private Long id;
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "rol_privilegio", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "rol_id"),
            inverseJoinColumns = @JoinColumn(name = "privilegio_id")
    )
    private Set<Privilegio> privilegios; // Define como colección
}