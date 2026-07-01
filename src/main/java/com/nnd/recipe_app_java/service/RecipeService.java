package com.nnd.recipe_app_java.service;

import com.nnd.recipe_app_java.exceptions.RecipeNotFoundException;
import com.nnd.recipe_app_java.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RecipeService {

    // in-memory solution as long as there is no database:
    private final ArrayList<Recipe> recipeCollection = new ArrayList<>();
    // later the database will generate ID:
    private Long idCounter = 1L;

    /**
     * Saves the given recipe in the recipeCollection and returns it.
     */
    public Recipe createRecipe(Recipe recipe) {
        recipe.setId(idCounter);
        idCounter++;
        recipeCollection.add(recipe);
        return recipe;
    }

    /**
     * Returns all recipes.
     */
    public ArrayList<Recipe> findAllRecipes() {
        return recipeCollection;
    }

    /**
     * Returns the recipe with the specified ID.
     *
     * @throws RecipeNotFoundException if no recipe with the given ID exists
     */
    public Recipe findRecipeById(Long id) {
        for (Recipe recipe : recipeCollection) {
            if (recipe.getId() == id) {
                return recipe;
            }
        }
        throw new RecipeNotFoundException(id);
    }

    /**
     * Updates and returns the updated version of the recipe with the specified ID.
     *
     * @throws RecipeNotFoundException if no recipe with the given ID exists
     */
    public Recipe updateRecipeById(Long id, Recipe updatedRecipe)   {
        for (Recipe recipe : recipeCollection) {
            if (recipe.getId() == id) {
                recipeCollection.remove(recipe);
                updatedRecipe.setId(id);
                recipeCollection.add(updatedRecipe);
                return updatedRecipe;
            }
        }
        throw new RecipeNotFoundException(id);
    }

    /**
     * Returns the recipe with the specified ID and deletes it from the recipeCollection.
     *
     * @throws RecipeNotFoundException if no recipe with the given ID exists
     */
    public Recipe deleteRecipeById(Long id) {
        for (Recipe recipe : recipeCollection) {
            if (recipe.getId() == id) {
                recipeCollection.remove(recipe);
                return recipe;
            }
        }
        throw new RecipeNotFoundException(id);
    }
}
