package com.scaler.productservicejun2026.Services;

import com.scaler.productservicejun2026.Dtos.FakestoreProductDto;
import com.scaler.productservicejun2026.Models.Category;
import com.scaler.productservicejun2026.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    public Product convertFakeStoreDtoToProduct(FakestoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setTitle(fakeStoreProductDto.getTitle());
//        product.setSlug(fakeStoreProductDto.getSlug());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setDescription(fakeStoreProductDto.getDescription());
        Category category = new Category();
//        category.setId(fakeStoreProductDto.getCategory().getId());
//        category.setSlug(fakeStoreProductDto.getCategory().getSlug());
//        category.setName(fakeStoreProductDto.getCategory().getName());
//        category.setImage(fakeStoreProductDto.getCategory().getImage());
        category.setName(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        product.setImage(fakeStoreProductDto.getImage());
        return product;
    }

    @Override
    public Product getSingleProduct(long productId) {
//        RestTemplate restTemplate = new RestTemplate();
        FakestoreProductDto fakeStoreProductDto =restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+productId,
                 FakestoreProductDto.class);
        return convertFakeStoreDtoToProduct(fakeStoreProductDto);
    }

    @Override
    public List<Product> getAllProduct() {
        return List.of();
    }

    @Override
    public Product crateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(long productId) {

    }

    @Override
    public void updateProduct(long productId, Product product) {

    }

    @Override
    public void replaceProduct(long productId, Product product) {

    }
}
