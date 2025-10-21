package dev.luis.goes.dto.response;

import dev.luis.goes.model.ProductType;

import java.math.BigDecimal;

public record ProductResponse(
        String name,
        BigDecimal price,
        ProductType type,
        Double importTax
) {
}