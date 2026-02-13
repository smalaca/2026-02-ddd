package com.smalaca.opentrainingsale.domain.cart;

// repository
// secondary port
public interface CartRepository {
    Cart findById(CartId cartId);

    void save(Cart cart);
}
