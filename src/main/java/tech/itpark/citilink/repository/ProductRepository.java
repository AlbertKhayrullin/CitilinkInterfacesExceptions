package tech.itpark.citilink.repository;

import tech.itpark.citilink.domain.Product;

import java.util.ArrayList;

public interface ProductRepository {
    ArrayList<Product> getAll();
    void save(Product product);
    void removeById(long id);
}
