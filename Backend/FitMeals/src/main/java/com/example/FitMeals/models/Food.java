package com.example.FitMeals.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double calories;
    private double protein;
    private double fat;
    private double carbs;

    @OneToMany(mappedBy = "food")
    private Set<MealItem> mealItems;


    public Food(String name, double calories, double protein, double fat, double carbs, Set<MealItem> mealItems) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
        this.mealItems = mealItems;
    }
}
