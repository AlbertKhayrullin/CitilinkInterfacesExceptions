package tech.itpark.citilink.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IPhonе extends Product {
    private int memory;
    private String color;

    public IPhonе(long id, String name, int price, boolean removed, int memory, String color) {
        super(id, name, price, removed);
        this.memory = memory;
        this.color = color;
    }
}

