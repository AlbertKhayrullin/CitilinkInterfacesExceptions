package tech.itpark.citilink.manager;

import tech.itpark.citilink.domain.*;
import tech.itpark.citilink.repository.ProductRepository;
import tech.itpark.citilink.repository.ProductRepositoryInMemory;

import java.util.ArrayList;

public class ProductManager {
    // private ProductRepository repository = new ProductRepositoryInMemory();
    private ArrayList<Product> items = new ArrayList<>();

    public ArrayList<Product> getAll() {
        return items;
    }

    // выделить + Ctrl + Shift + стрелки вверх/вниз
    public ArrayList<Product> search(String text) {
        ArrayList<Product> result = new ArrayList<>();
        String target = text.trim().toLowerCase();

        for (Product item : items) {
            if (contains(item.getName(), target)) {
                result.add(item);
                continue;
            }

            // inst + Tab
            if (item instanceof Book) {
                Book book = (Book) item;
                if (contains(book.getAuthor(), target)) {
                    result.add(item);
                    continue;
                }
            }

            if (item instanceof Laptop) {
                Laptop laptop = (Laptop) item;
                if (contains(laptop.getModel(), target)) {
                    result.add(item);
                    continue;
                }

            }

            if (item instanceof IPhonе) {
                IPhonе iPhonе = (IPhonе) item;
                if (contains((iPhonе.getColor()), target)) {
                    result.add(item);
                    continue;
                }
            }
        }

        return result;
    }

    public ArrayList<Product> filter(String type) {
        ArrayList<Product> result = new ArrayList<>();

        // && - логическое И
        for (Product item : items) {
            if (type.equals("caps") && item instanceof Cap) {
                result.add(item);
                continue;
            }

            if (type.equals("books") && item instanceof Book) {
                result.add(item);
                continue;
            }

            if (type.equals("iPhones") && item instanceof IPhonе) {
                result.add(item);
                continue;
            }

            if (type.equals("laptops") && item instanceof Laptop) {
                result.add(item);
                continue;
            }
        }

        return result;
    }

    public void add(Product product) {
        items.add(product);
    }

    private boolean contains(String field, String target) {
        return field.toLowerCase().contains(target);
    }
}