package pl.michal.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.michal.dto.ProductDTO;
import pl.michal.entity.Product;
import pl.michal.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDTO> productList(){
        log.info("product list");
        return productRepository.findAll().stream()
                .map(product -> new ProductDTO(product.getProductId()))
                .collect(Collectors.toList());

    }

    public void createOrUpdate(ProductDTO dto){
        Product product = Product.builder()
                .productId(dto.getProductId())
                .productName(dto.getProductName())
                .productDescription(dto.getProductDescription())
                .productPrice(dto.getProductPrice())
                .build();
        productRepository.save(product);
    }


}
