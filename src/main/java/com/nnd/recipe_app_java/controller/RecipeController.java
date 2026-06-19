package com.nnd.recipe_app_java.controller;

import com.nnd.recipe_app_java.model.Recipe;
import com.nnd.recipe_app_java.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RecipeController {
    private final RecipeService recipeService;

    RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /**
     * Returns all stored recipes.
     *
     * @return list of all recipes
     */
    @GetMapping("/recipes")
    public ArrayList<Recipe> getAllRecipes() {
        return recipeService.findAllRecipes();
    }

    /**
     * Retrieves a single recipe by its unique identifier.
     *
     * @param id unique identifier of the recipe
     * @return the matching Recipe object
     */
    @GetMapping("/recipes/{id}")
    public Recipe getRecipeById(@PathVariable int id) {
        return recipeService.findRecipeById(id);
    }

    /**
     * Creates a new recipe and stores it in the system.
     *
     * @param recipe the recipe data sent by the client
     * @return the created Recipe object
     */
    @PostMapping("/newRecipe")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }
}
