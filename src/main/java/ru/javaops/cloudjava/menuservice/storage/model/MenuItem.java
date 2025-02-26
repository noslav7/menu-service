package ru.javaops.cloudjava.menuservice.storage.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "menu_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column(name = "time_to_cook", nullable = false)
    private Long timeToCook;

    @Column(nullable = false)
    private Float weight;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Type(JsonBinaryType.class)
    @Column(name = "ingredient_collection", columnDefinition = "jsonb", nullable = false)
    private IngredientCollection ingredientCollection;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(id, menuItem.id) &&
                Objects.equals(name, menuItem.name) &&
                Objects.equals(description, menuItem.description) &&
                Objects.equals(price, menuItem.price) &&
                category == menuItem.category &&
                Objects.equals(timeToCook, menuItem.timeToCook) &&
                Objects.equals(weight, menuItem.weight) &&
                Objects.equals(imageUrl, menuItem.imageUrl) &&
                Objects.equals(ingredientCollection, menuItem.ingredientCollection) &&
                Objects.equals(createdAt, menuItem.createdAt) &&
                Objects.equals(updatedAt, menuItem.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, category, timeToCook, weight, imageUrl, ingredientCollection, createdAt, updatedAt);
    }
}
