package com.nnd.recipe_app_java.controller;

import com.nnd.recipe_app_java.model.MealType;
import com.nnd.recipe_app_java.model.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// test endpoint
@RestController
public class RecipeController {
    @GetMapping("/testRecipe")
    public Recipe getRecipe(){
        Recipe dummyRecipe = Recipe.builder()
                .name("Pizza Margarita")
                .portions(2)
                .mealType(MealType.Main)
                .build();
        return dummyRecipe;
    }
}
