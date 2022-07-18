package restaurantejsp.springboot.restaurante.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cliente {

    @Id
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Cliente toCliente() {
        Cliente cliente = new Cliente();
        cliente.setCpf(this.cpf);
        cliente.setNome(this.nome);
        cliente.setTelefone(this.telefone);
        cliente.setEmail(this.email);
        cliente.setSenha(this.senha);
        return cliente;
    }
}


