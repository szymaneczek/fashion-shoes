package pl.michal;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.michal.entity.Product;
import pl.michal.repository.ProductRepository;

import java.util.Arrays;
import java.util.List;

public class ProductFinderTest {

    private ProductRepository productRepository = Mockito.mock(ProductRepository.class);

    private ProductFinder productFinder = new ProductFinder(productRepository);

    @Test
    public void shouldReturnAllProducts(){
        //given
        List<Product> productEntities = Arrays.asList(
                Product.builder().productName("Półbuty Adidas").productDescription("Półbuty damskie rozmiar 36").build(),
                Product.builder().productName("Półbuty Nike").productDescription("Półbuty damskie rozmiar 38").build(),
                Product.builder().productName("Sandały").productDescription("Sandały męskie rozmiar 42").build(),
                Product.builder().productName("Sniegowce Kiloutou").productDescription("Sniegowce dzieciece rozmiar 22").build());

        Mockito.when(productRepository.findAll()).thenReturn(productEntities);
    }
}
