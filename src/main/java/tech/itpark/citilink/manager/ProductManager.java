package tech.itpark.citilink.manager;

import tech.itpark.citilink.handler.IdNotFound;
import tech.itpark.citilink.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> items = new ArrayList<>();

    public List<Product> getAll() {
        return items;
    }

    public List<Product> search(String text) {
        List<Product> result = new ArrayList<>();
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

    public List<Product> filter(String type) {
        List<Product> result = new ArrayList<>();

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

    public Product getById (long id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new IdNotFound();
    }

    public void removeById (long id) {
        for (Product item : items) {
            if (item.getId() == id) {
                item.setRemoved(true);
                return;
            }
        }
        throw new IdNotFound();
    }

    public Product updateById (long id, ProductUpdate dto) {
        for (Product item : items) {
            if (item.getId() == id) {
                item.setName(dto.getName());
                item.setPrice(dto.getPrice());
                return item;
            }
        }
        throw new IdNotFound();
    }

    private boolean contains(String field, String target) {
        return field.toLowerCase().contains(target);
    }
}