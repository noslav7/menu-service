package ru.javaops.cloudjava.menuservice.storage.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum MenuCategory {
    APPETIZER("Appetizer"),
    MAIN_COURSE("Main Course"),
    DESSERT("Dessert"),
    DRINK("Drink");

    private final String value;

    MenuCategory(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }


    public static MenuCategory fromValue(String value) {
        return Arrays.stream(values())
                .filter(category -> category.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid category " + value));
    }
}
