package restaurantejsp.springboot.restaurante.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurantejsp.springboot.restaurante.modelo.Prato;

public interface PratoRepositorio extends JpaRepository<Prato, Long> {

}

