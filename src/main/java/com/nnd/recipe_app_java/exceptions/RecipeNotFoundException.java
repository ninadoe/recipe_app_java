package com.nnd.recipe_app_java.exceptions;

/**
 * Handles requests for recipes that do not exist.
 *
 * Returns an HTTP 404 (Not Found) response together with an error message.
 */
public class RecipeNotFoundException extends RuntimeException {
    public RecipeNotFoundException(Long id) {
        super("Recipe with ID " + id + " not found.");
    }
}
