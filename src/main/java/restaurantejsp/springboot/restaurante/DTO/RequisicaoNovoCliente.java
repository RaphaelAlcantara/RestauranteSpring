package restaurantejsp.springboot.restaurante.DTO;

import restaurantejsp.springboot.restaurante.modelo.Cliente;

public class RequisicaoNovoCliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente toCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(this.nome);
        cliente.setCpf(this.cpf);
        cliente.setTelefone(this.telefone);
        cliente.setEmail(this.email);
        cliente.setSenha(this.senha);
        return cliente;
    }


    @Override
    public String toString() {
        return "RequisicaoNovoCliente [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email
                + ", senha=" + senha + "]";
    }
}
