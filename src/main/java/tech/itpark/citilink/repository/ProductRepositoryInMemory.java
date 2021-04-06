package tech.itpark.citilink.repository;

import tech.itpark.citilink.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryInMemory implements ProductRepository {
    private List<Product> items = new ArrayList<>();

    @Override
    public List<Product> getAll() {
        return items;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void removeById(long id) {

    }
}
