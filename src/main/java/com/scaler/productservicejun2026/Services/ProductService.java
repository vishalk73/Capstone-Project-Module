package com.scaler.productservicejun2026.Services;

import com.scaler.productservicejun2026.Models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long productId);
    List<Product> getAllProduct();
    Product crateProduct(Product product);
    void deleteProduct(long productId);
    void updateProduct(long productId ,Product product);
    void replaceProduct(long productId, Product product );
}
