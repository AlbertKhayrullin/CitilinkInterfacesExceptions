package tech.itpark.citilink.repository;

import tech.itpark.citilink.domain.Product;
import java.util.List;

public class ProductRepositoryInFile implements ProductRepository {
    @Override
    public List<Product> getAll() {
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
