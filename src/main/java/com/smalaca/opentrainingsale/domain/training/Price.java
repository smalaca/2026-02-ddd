package com.smalaca.opentrainingsale.domain.training;

import java.math.BigDecimal;

// value object
public class Price {
    private final BigDecimal price;

    private Price(BigDecimal price) {
        this.price = price;
    }

    // factory
    public static Price from(BigDecimal price) {
        return new Price(price);
    }
}
