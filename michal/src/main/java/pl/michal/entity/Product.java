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
@Enumerated(EnumType.STRING)
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
    public enum productType{MALE(0.05),FEMALE(0.05),KID(0.1)}
    public final Double discount;
    private Element(Double discount){this.discount = discount;}
    @Column(name = "Price")
    private Long productPrice;

    public ProductDTO toDto(){
        return ProductDTO.builder()
                .productId(productId)
                .productName(productName)
                .productDescription(productDescription)
                .productType(productType)
                .productPrice(productPrice)
                .build();
    }
}
