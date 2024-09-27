package dev.store.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
@Entity
@Data//almacena y genera automatic los get y set
@Table (name = "departamento")//da el nombre a la tabla

public class Departamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
}

