package tech.itpark.citilink.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Product {
    private String author;

    public Book(long id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }
}
