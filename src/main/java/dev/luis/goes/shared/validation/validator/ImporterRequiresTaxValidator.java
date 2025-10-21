package dev.luis.goes.shared.validation.validator;

import dev.luis.goes.dto.request.ProductRequest;
import dev.luis.goes.model.ProductType;
import dev.luis.goes.shared.validation.annotation.ImporterRequiresTax;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ImporterRequiresTaxValidator implements ConstraintValidator<ImporterRequiresTax, ProductRequest> {

    @Override
    public boolean isValid(ProductRequest request, ConstraintValidatorContext context) {
        if (request == null) return false;

        if (request.type() == ProductType.IMPORTED) {
            return request.importTax() != null && request.importTax() > 0.0;
        }

        return request.importTax() == null || request.importTax() == 0.0;
    }
}