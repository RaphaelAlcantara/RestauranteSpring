package restaurantejsp.springboot.restaurante.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurantejsp.springboot.restaurante.modelo.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

}

