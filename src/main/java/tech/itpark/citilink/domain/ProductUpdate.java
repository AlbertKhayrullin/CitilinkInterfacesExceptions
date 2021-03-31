package tech.itpark.citilink.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ProductUpdate {
    private String name;
    private int price;
}
