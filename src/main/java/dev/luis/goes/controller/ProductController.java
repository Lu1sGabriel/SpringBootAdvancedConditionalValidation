package dev.luis.goes.controller;

import dev.luis.goes.dto.request.ProductRequest;
import dev.luis.goes.dto.response.ProductResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody @Valid ProductRequest request) {
        ProductResponse response = new ProductResponse(request.name(), request.price(), request.type(), request.importTax());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}