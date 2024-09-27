package dev.store.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data//almacena y genera automatic los get y set
@Table (name = "temporada")//da el nombre a la tabla

public class Temporada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;

}

