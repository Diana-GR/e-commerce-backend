package dev.store.e_commerce.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table (name= "producto")
public class Producto  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String descripcion;
    private String color;
    private String imagen;
    private String talla;
    private Float precio;

    @ManyToOne
    @JoinColumn(name ="id_marca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name ="id_subcategoria")
    private Subcategoria subcategoria;

    @ManyToOne
    @JoinColumn(name ="id_temporada")
    private Temporada temporada;

    @OneToMany(mappedBy = "producto")
    private Set<Sucursal_producto> stockSucursalProducto;
}