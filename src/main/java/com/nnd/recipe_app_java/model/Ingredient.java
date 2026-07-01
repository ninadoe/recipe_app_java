package com.nnd.recipe_app_java.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ingredient {
    @NotBlank
    private String name;
    private Double amount; // optional
    private Unit unit; // optional
    private String additional; // optional
}
