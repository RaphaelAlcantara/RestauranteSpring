package restaurantejsp.springboot.restaurante.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Prato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String urlImagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prato toPrato(){
        Prato prato = new Prato();
        prato.setId(this.id);
        prato.setNome(this.nome);
        prato.setDescricao(this.descricao);
        prato.setPreco(this.preco);
        prato.setUrlImagem(this.urlImagem);
        return prato;
    }
}
