package com.smalaca.opentrainingsale.application.cart;

import com.smalaca.opentrainingsale.domain.cart.Cart;
import com.smalaca.opentrainingsale.domain.cart.CartId;
import com.smalaca.opentrainingsale.domain.cart.CartRepository;
import com.smalaca.opentrainingsale.domain.training.TrainingId;

import java.util.UUID;

// application layer
public class CartApplicationService {
    private final CartRepository cartRepository;

    public CartApplicationService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    // primary port
    public void add(UUID cartId, UUID trainingId) {
        CartId cartIdVO = new CartId(cartId);
        TrainingId trainingIdVO = new TrainingId(trainingId);
        Cart cart = cartRepository.findById(cartIdVO);

        cart.add(trainingIdVO);

        cartRepository.save(cart);
    }
}
