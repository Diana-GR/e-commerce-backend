package dev.store.e_commerce.model;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
@Entity
@Data//almacena y genera automatic los get y set
@Table (name = "metodo_pago")//da el nombre a la tabla

public class Metodo_pago implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String descripcion;


}





