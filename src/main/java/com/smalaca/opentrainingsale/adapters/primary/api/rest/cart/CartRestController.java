package com.smalaca.opentrainingsale.adapters.primary.api.rest.cart;

import com.smalaca.opentrainingsale.application.cart.CartApplicationService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("cart")
public class CartRestController {
    private final CartApplicationService cartApplicationService;

    public CartRestController(CartApplicationService cartApplicationService) {
        this.cartApplicationService = cartApplicationService;
    }

    @PutMapping
    public void add(@RequestBody AddTrainingDto dto) {
        cartApplicationService.add(dto.cartId(), dto.trainingId());
    }
}
