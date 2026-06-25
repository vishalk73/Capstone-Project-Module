package com.scaler.productservicejun2026.Models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonPropertyOrder({
        "id",
        "title",
        "slug",
        "price",
        "description",
        "category",
        "image"
})

@Getter
@Setter
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
    private Category category;
//    private List<String> Images;
}
