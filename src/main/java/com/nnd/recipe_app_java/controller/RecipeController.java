package com.nnd.recipe_app_java.controller;

import com.nnd.recipe_app_java.model.Recipe;
import com.nnd.recipe_app_java.service.RecipeService;
import jakarta.validation.Valid;
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
    @GetMapping("/recipe/{id}")
    public Recipe getRecipeById(@PathVariable Long id) {
        return recipeService.findRecipeById(id);
    }

    /**
     * Creates a new recipe and stores it in the system.
     *
     * @param recipe the recipe data sent by the client
     * @return the created Recipe object
     */
    @PostMapping("/recipe/create")
    public Recipe createRecipe(@Valid @RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }

    /**
     * Deletes a single recipe by its unique identifier.
     *
     * @param id unique identifier of the recipe
     * @return the matching Recipe object
     */
    @DeleteMapping("/recipe/delete/{id}")
    public Recipe deleteRecipe(@PathVariable Long id) {
        return recipeService.deleteRecipeById(id);
    }

    /**
     * Update a single recipe by its unique identifier.
     *
     * @param id unique identifier of the recipe
     * @return the matching updated Recipe object
     */
    @PutMapping("/recipe/update/{id}")
    public Recipe updateRecipe(@PathVariable Long id, @Valid @RequestBody Recipe recipe) {
        return recipeService.updateRecipeById(id, recipe);
    }
}
