package pl.michal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.michal.entity.product;

public interface ProductRepository extends JpaRepository <product,Long>{
}
