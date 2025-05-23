package ru.javaops.cloudjava.menuservice.testutils;

import ru.javaops.cloudjava.menuservice.dto.CreateMenuRequest;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.storage.model.Category;
import ru.javaops.cloudjava.menuservice.storage.model.Ingredient;
import ru.javaops.cloudjava.menuservice.storage.model.IngredientCollection;

import java.math.BigDecimal;
import java.util.List;

import static ru.javaops.cloudjava.menuservice.testutils.TestConstants.*;


public class TestData {

    public static IngredientCollection italianSaladIngredients() {
        return new IngredientCollection(
                List.of(
                        new Ingredient(ITALIAN_SALAD_GREENS_INGREDIENT, ITALIAN_SALAD_GREENS_INGREDIENT_CALORIES),
                        new Ingredient(ITALIAN_SALAD_TOMATOES_INGREDIENT, ITALIAN_SALAD_TOMATOES_INGREDIENT_CALORIES)
                )
        );
    }

    public static UpdateMenuRequest updateMenuFullRequest() {
        return UpdateMenuRequest.builder()
                .name("New Cappuccino")
                .price(BigDecimal.valueOf(100.01))
                .timeToCook(2000L)
                .description("New Cappuccino Description")
                .imageUrl("http://images.com/new_cappuccino.png")
                .build();
    }

    public static CreateMenuRequest createMenuRequest() {
        return CreateMenuRequest.builder()
                .name(ITALIAN_SALAD_NAME)
                .description(ITALIAN_SALAD_DESCRIPTION)
                .price(ITALIAN_SALAD_PRICE)
                .category(Category.SALADS)
                .timeToCook(ITALIAN_SALAD_TIME_TO_COOK)
                .weight(ITALIAN_SALAD_WEIGHT)
                .imageUrl(ITALIAN_SALAD_IMAGE_URL)
                .ingredientCollection(italianSaladIngredients())
                .build();
    }
}
