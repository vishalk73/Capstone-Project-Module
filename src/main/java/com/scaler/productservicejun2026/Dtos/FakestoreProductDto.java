package com.scaler.productservicejun2026.Dtos;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.scaler.productservicejun2026.Models.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class FakestoreProductDto {
    private long id;
    private String title;
    private String slug;
    private double price;
    private String description;
    private String category;
    private String Image;
//    private List<String> Images;
}

