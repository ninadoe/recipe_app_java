package com.nnd.recipe_app_java.model;

import lombok.Getter;

@Getter
public class Ingredient {
    String name;
    Double amount; // optional
    Unit unit; // optional
    String additional; // optional

    Ingredient(String name, Double amount, Unit unit, String additional) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.additional = additional;
    }
}
