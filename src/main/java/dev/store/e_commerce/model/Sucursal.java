package dev.store.e_commerce.model;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data//almacena y genera automatic los get y set
@Table (name = "sucursal")//da el nombre a la tabla

public class Sucursal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String direccion;

    @ManyToOne
    @JoinColumn(name="id_ciudad")
    private Ciudad ciudad;

    // Relación con StockSucursalProducto
    @OneToMany(mappedBy = "sucursal")
    private Set<Sucursal_producto> stockSucursalProducto;
}





