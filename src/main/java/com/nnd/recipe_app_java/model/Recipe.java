package com.nnd.recipe_app_java.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    private Long id;
    @NotBlank
    private String name;
    @NotEmpty
    private Ingredient[] ingredients;
    @NotEmpty
    private String[] method;
    private String[] utensils; // optional
    private Integer portions; // optional
    private MealType mealType; // optional
    private Diet diet; // optional
    private PrimaryCarb primaryCarb; // optional
    private String origin; // optional
    private String note; // optional
}
