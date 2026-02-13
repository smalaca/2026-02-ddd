package com.smalaca.opentrainingsale.adapters.secondary.repository.inmemory.cart;

import com.smalaca.opentrainingsale.domain.cart.Cart;
import com.smalaca.opentrainingsale.domain.cart.CartId;
import com.smalaca.opentrainingsale.domain.cart.CartRepository;

// secondary adapter
public class InMemoryCartRepository implements CartRepository {
    @Override
    public Cart findById(CartId cartId) {
        return null;
    }

    @Override
    public void save(Cart cart) {

    }
}
