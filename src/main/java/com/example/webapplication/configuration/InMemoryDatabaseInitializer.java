package com.example.webapplication.configuration;

import com.example.webapplication.product.persistence.entity.Product;
import com.example.webapplication.product.persistence.repository.ProductRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class InMemoryDatabaseInitializer {

    private final ProductRepository productRepository;

    public InMemoryDatabaseInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void init(){
        Product foundation = new Product("L'oreal True match", "foundation", 30, "");
        Product serum = new Product("L'oreal Revitalift LASER", "serum", 30, "");
        Product cream = new Product("Nivea", "facecream", 250, "");
        productRepository.saveAll(List.of(foundation,serum,cream));
    }
}
