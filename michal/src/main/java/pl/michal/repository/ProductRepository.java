package pl.michal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.michal.entity.Product;

public interface ProductRepository extends JpaRepository <Product,Long>{
}
