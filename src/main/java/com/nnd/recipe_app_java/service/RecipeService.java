package com.nnd.recipe_app_java.service;

import com.nnd.recipe_app_java.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    private final ArrayList<Recipe> recipeCollection = new ArrayList<>();

    // createRecipe
    public Recipe createRecipe(Recipe recipe) {
        recipeCollection.add(recipe);
        return recipe;
    }

    // findAllRecipes
    public ArrayList<Recipe> findAllRecipes() {
        return recipeCollection;
    }

    // findRecipeById
    public Recipe findRecipeById(int id) {
        for (Recipe recipe : recipeCollection) {
            if (recipe.getId() == id) {
                return recipe;
            }
        }
        return null;
    }

    // updateRecipe

    // deleteRecipeById
    public Recipe deleteRecipeById(int id) {
        for (Recipe recipe : recipeCollection) {
            if (recipe.getId() == id) {
                recipeCollection.remove(id);
                return recipe;
            }
        }
        return null;
    }
}
