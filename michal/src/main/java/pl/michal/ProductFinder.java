package pl.michal;

import org.springframework.stereotype.Service;
import pl.michal.dto.productDTO;
import pl.michal.entity.product;
import pl.michal.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductFinder {

    private final ProductRepository productRepository;

    public List<productDTO> productList(){
        return productRepository.findAll().stream()
                .map(product::toDto)
                .collect(Collectors.toList());
    }

    public ProductFinder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
