package pl.michal;

import org.springframework.stereotype.Service;
import pl.michal.dto.ProductDTO;
import pl.michal.entity.Product;
import pl.michal.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductFinder {

    private final ProductRepository productRepository;

    public List<ProductDTO> productList(){
        return productRepository.findAll().stream()
                .map(Product::toDto)
                .collect(Collectors.toList());
    }

    public ProductFinder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
