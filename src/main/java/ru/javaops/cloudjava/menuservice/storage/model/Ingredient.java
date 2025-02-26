package ru.javaops.cloudjava.menuservice.storage.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Ingredient {
    private String name;
    private int calories;
}
