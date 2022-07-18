package restaurantejsp.springboot.restaurante.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurantejsp.springboot.restaurante.modelo.Cliente;

//permite operações básicas de acesso ao BD
@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String> {
    
}

