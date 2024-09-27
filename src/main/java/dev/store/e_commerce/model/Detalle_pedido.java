package dev.store.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data//almacena y genera automatic los get y set
@Getter
@Setter

@Table (name = "detalle_pedido")//da el nombre a la tabla

public class Detalle_pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int cantidad;
    private Float precio_unitario;
    private Float subtotal;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}

