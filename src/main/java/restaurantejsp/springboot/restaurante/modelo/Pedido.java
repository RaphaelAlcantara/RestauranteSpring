package restaurantejsp.springboot.restaurante.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String prato;
    private LocalDateTime data = LocalDateTime.now();
    private Double preco;
    private String pagamento;
    private String observacao;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Pedido Topedido() {
        Pedido pedido = new Pedido();
        pedido.setId(this.id);
        pedido.setNome(this.nome);
        pedido.setPrato(this.prato);
        pedido.setData(this.data);
        pedido.setPreco(this.preco);
        pedido.setPagamento(this.pagamento);
        pedido.setObservacao(this.observacao);
        return pedido;
    }
}

