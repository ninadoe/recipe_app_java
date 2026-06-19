package com.nnd.recipe_app_java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ingredient {
    private String name;
    private Double amount; // optional
    private Unit unit; // optional
    private String additional; // optional
}
