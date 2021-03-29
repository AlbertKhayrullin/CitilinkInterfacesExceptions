package tech.itpark.citilink.repository;

import tech.itpark.citilink.domain.Product;

import java.util.ArrayList;

public class ProductRepositoryInMemory implements ProductRepository {
    private ArrayList<Product> items = new ArrayList<>();

    @Override
    public ArrayList<Product> getAll() {
        return items;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void removeById(long id) {

    }
}
