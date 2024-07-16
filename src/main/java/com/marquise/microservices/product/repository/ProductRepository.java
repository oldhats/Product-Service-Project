package com.marquise.microservices.product.repository;

import java.util.Collection;
import com.marquise.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{

}
