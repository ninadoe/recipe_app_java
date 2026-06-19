package com.nnd.recipe_app_java.controller;

import com.nnd.recipe_app_java.model.MealType;
import com.nnd.recipe_app_java.model.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
    // test get endpoint
    @GetMapping("/testRecipe")
    public Recipe getRecipe() {
        System.out.println("GET HIT");
        Recipe dummyRecipe = new Recipe();
        dummyRecipe.setName("Pizza Margarita");
        dummyRecipe.setPortions(2);
        dummyRecipe.setMealType(MealType.Main);
        return dummyRecipe;
    }

    // test post endpoint
    @PostMapping("/newRecipe")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipe;
    }
}
