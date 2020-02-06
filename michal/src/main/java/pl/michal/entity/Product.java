package pl.michal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.michal.dto.ProductDTO;

import javax.persistence.*;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @Column(name = "Name")
    private String productName;
    @Column(name = "Description")
    private String productDescription;
    @Column(name = "Type")
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    @Column(name = "Price")
    private Long productPrice;

    public Product(Long productId, String productName, String productDescription, String productType, Long productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        }

        public ProductDTO toDto(){
        return ProductDTO.builder()
                .productId(productId)
                .productName(productName)
                .productDescription(productDescription)
                .productPrice(productPrice)
                .build();
        }
    }

