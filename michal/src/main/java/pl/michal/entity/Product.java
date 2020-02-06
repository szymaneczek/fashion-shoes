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
    private ProductType productType;
    @Column(name = "Price")
    private Long productPrice;


    }

