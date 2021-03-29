package tech.itpark.citilink.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private long id;
    private String name;
    private int price;
}
