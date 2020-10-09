package com.kodilla.patterns22.facade.api;

public final class ItemDto {
    private final Long productId;
    private final double quantity;

    public ItemDto(final Long productId, final double quanntity) {
        this.productId = productId;
        this.quantity = quanntity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuanntity() {
        return quantity;
    }
}
