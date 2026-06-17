package com.nnd.recipe_app_java.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Recipe {
    private final int id;
    private final String name;
    private final Ingredient[] ingredients;
    private final String[] method;
    private final String[] utensils; // optional
    private final Integer portions; // optional
    private final MealType mealType; // optional
    private final Diet diet; // optional
    private final String origin; // optional
    private String note; // optional
}
