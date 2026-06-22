package com.scaler.productservicejun2026.Controllers;

import com.scaler.productservicejun2026.Models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/{id}")
    public Product getSingleProductById(@PathVariable("id") long productId){
        return null;
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return new ArrayList<>();
    }

    @PostMapping
    public Product createProduct(){
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") long productId){

    }

    @PatchMapping("/{id}")
    public void updateProduct(@PathVariable("id") long productId , @RequestBody Product product){

    }

    public void replaceProduct(@PathVariable("id") long productId , @RequestBody Product product){

    }
}
