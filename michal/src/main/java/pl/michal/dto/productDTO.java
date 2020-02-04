package pl.michal.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class productDTO {

    private long productId;
    private String productName;
    private String productDescription;
    private String productType;
    private long productPrice;

    public productDTO (long productId){this.productId = productId;}
}
