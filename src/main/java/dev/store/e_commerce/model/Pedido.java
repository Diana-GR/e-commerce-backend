package dev.store.e_commerce.model;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data//almacena y genera automatic los get y set
@Table (name = "pedido")//da el nombre a la tabla

public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Date fecha_pedido;
    private Long total;

    @ManyToOne
    @JoinColumn(name="id_sucursal")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "id_estado_pedido")
    private Estado_pedido estadoPedido;

    @ManyToOne
    @JoinColumn(name = "id_metodo_pago")
    private Metodo_pago metodo_pago;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "producto")
    private List<Detalle_pedido> detallesPedido;

}





