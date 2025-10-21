package dev.luis.goes.dto.request;

import dev.luis.goes.model.ProductType;
import dev.luis.goes.shared.validation.annotation.ImporterRequiresTax;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@ImporterRequiresTax
public record ProductRequest(
        @NotBlank @Size(min = 3) String name,
        @NotNull @Positive BigDecimal price,
        @NotNull ProductType type,
        Double importTax
) {

}