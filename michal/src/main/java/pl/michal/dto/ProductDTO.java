package pl.michal.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private long productId;
    private String productName;
    private String productDescription;
    private Double discount;
    private long productPrice;


}
