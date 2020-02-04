package pl.michal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.michal.dto.productDTO;

import javax.persistence.*;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Product")

public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @Column(name = "Name")
    private String productName;
    @Column(name = "Description")
    private String productDescription;
    @Column(name = "Type")
    private String productType;
    @Column(name = "Price")
    private Long productPrice;

    public productDTO toDto(){
        return productDTO.builder()
                .productId(productId)
                .productName(productName)
                .productDescription(productDescription)
                .productType(productType)
                .productPrice(productPrice)
                .build();
    }
}
