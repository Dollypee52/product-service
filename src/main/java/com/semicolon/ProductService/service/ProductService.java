package com.semicolon.ProductService.service;

import com.semicolon.ProductService.dto.ProductRequest;
import com.semicolon.ProductService.dto.ProductResponse;
import com.semicolon.ProductService.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    Product createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
