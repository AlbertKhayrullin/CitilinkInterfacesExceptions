package tech.itpark.citilink.controller;
// 1. @RestController
// 2. Создаём поле, в котором будем хранить нужного менеджера
// 3. Создаём методы, над которыми пишем аннотации:
// - @Get/Post/DeleteMapping
// - @RequestBody/@RequestParam
// 4. Если во всех @...Mapping начало одинаковое, то можно его написать прямо над классом

import org.springframework.web.bind.annotation.*;
import tech.itpark.citilink.domain.*;
import tech.itpark.citilink.manager.ProductManager;

import java.util.ArrayList;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductManager manager = new ProductManager();

    @GetMapping() // над классом + то, что написано здесь -> "/products"
    public ArrayList<Product> getAll() {
        return manager.getAll();
    }

    @GetMapping("/search") // /search?text=телевизор
    public ArrayList<Product> search(@RequestParam String text) {
        return manager.search(text);
    }

    // {id}
    @GetMapping("/catalog/{type}") // /catalog/caps | books
    public ArrayList<Product> filter(@PathVariable String type) {
        return manager.filter(type);
    }

    @PostMapping("/caps") // "/products" + "/caps" -> "/products/caps"
    public void add(@RequestBody Cap product) {
        manager.add(product);
    }

    @PostMapping("/books")
    public void add(@RequestBody Book product) {
        manager.add(product);
    }

    @PostMapping("/iPhones")
    public void add(@RequestBody IPhonе product) { manager.add(product); }

    @PostMapping("/laptops")
    public void add(@RequestBody Laptop product) { manager.add(product); }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable long id) { manager.removeById(id); }

    @PutMapping("/{id}")
    public Product updateById(@PathVariable long id, @RequestBody ProductUpdate dto) { return manager.updateById(id, dto); }

}