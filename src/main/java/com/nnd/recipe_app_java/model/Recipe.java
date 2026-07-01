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
    @NotBlank(message = "Recipe name is required.")
    private String name;
    @NotEmpty(message = "Ingredients are required.")
    private Ingredient[] ingredients;
    @NotEmpty(message = "Method is required.")
    private String[] method;
    private String[] utensils; // optional
    private Integer portions; // optional
    private MealType mealType; // optional
    private Diet diet; // optional
    private PrimaryCarb primaryCarb; // optional
    private String origin; // optional
    private String note; // optional
}
