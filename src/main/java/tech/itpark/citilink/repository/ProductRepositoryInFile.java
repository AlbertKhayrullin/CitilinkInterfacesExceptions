package tech.itpark.citilink.repository;

import tech.itpark.citilink.domain.Product;

import java.util.ArrayList;

public class ProductRepositoryInFile implements ProductRepository {
    @Override
    public ArrayList<Product> getAll() {
        // TODO: читать из файла
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void removeById(long id) {

    }
}
