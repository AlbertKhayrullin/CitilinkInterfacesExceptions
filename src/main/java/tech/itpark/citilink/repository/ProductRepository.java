package tech.itpark.citilink.repository;

import tech.itpark.citilink.domain.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    void save(Product product);
    void removeById(long id);
}
