package restaurantejsp.springboot.restaurante.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurantejsp.springboot.restaurante.modelo.Pagamento;

public interface PagamentoRepositorio extends JpaRepository<Pagamento, Long> {

}

