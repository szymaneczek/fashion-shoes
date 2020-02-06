package pl.michal.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum ProductType {
    @Enumerated(EnumType.STRING)
    MALE(0.05),
    FEMALE(0.05),
    KID(0.1);

    public final Double discount;
    
    private ProductType(Double discount) {
        this.discount = discount;
    }
}
