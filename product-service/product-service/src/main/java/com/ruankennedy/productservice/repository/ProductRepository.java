package com.ruankennedy.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ruankennedy.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
