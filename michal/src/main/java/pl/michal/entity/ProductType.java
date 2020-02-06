package pl.michal.entity;

public enum ProductType {
    MALE(0.05),
    FEMALE(0.05),
    KID(0.1);

    public final Double discount;
    
    private ProductType(Double discount) {
        this.discount = discount;
    }
}
