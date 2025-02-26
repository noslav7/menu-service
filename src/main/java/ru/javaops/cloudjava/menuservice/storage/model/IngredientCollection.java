package ru.javaops.cloudjava.menuservice.storage.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class IngredientCollection {
    private final List<Ingredient> ingredients;

    @JsonCreator
    public IngredientCollection(@JsonProperty("ingredients") List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}

