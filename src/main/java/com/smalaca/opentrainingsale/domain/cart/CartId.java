package com.smalaca.opentrainingsale.domain.cart;

import java.util.UUID;

// value object
public class CartId {
    private final UUID cartId;

    public CartId(UUID cartId) {
        this.cartId = cartId;
    }
}
