package com.example.myapplication;

//This Food object contains a unique identifier, nutrition facts, and searchable tags.

import java.util.HashMap;
import java.util.Map;

public class CalculationsAndSearch {

    // Class variables
    private int caloriesConsumed;
    private int fatConsumed;
    private int sodiumConsumed;
    private int carbsConsumed;
    private int sugarConsumed;
    private int proteinConsumed;

    // Constructor
    public CalculationsAndSearch(int caloriesConsumed, int fatConsumed, int sodiumConsumed, int carbsConsumed, int sugarConsumed, int proteinConsumed) {

        this.caloriesConsumed = caloriesConsumed;
        this.fatConsumed = fatConsumed;
        this.sodiumConsumed = sodiumConsumed;
        this.carbsConsumed = carbsConsumed;
        this.sugarConsumed = sugarConsumed;
        this.proteinConsumed = proteinConsumed;

        FoodRepository items = new FoodRepository();
        Map<String, Food> foods = items.getFoods();

        String searchValue = "burger";
        for(Map.Entry<String, Food> entry : foods.entrySet()) {
            Food v = entry.getValue();
            if(v.getTags().contains(searchValue)) {
                caloriesConsumed = (caloriesConsumed + v.getNutritionFacts().getCalories());
                fatConsumed = (fatConsumed + v.getNutritionFacts().getFat());
                sodiumConsumed = (sodiumConsumed + v.getNutritionFacts().getSodium());
                carbsConsumed = (carbsConsumed + v.getNutritionFacts().getCarbs());
                sugarConsumed = (sugarConsumed + v.getNutritionFacts().getSugar());
                proteinConsumed = (proteinConsumed + v.getNutritionFacts().getProtein());
            }
        }
    }

    // Getter methods
    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public int getFatConsumed() {
        return fatConsumed;
    }

    public int getSodiumConsumed() {
        return sodiumConsumed;
    }

    public int getCarbsConsumed() {
        return carbsConsumed;
    }

    public int getSugarConsumed() {
        return sugarConsumed;
    }

    public int getProteinConsumed() {
        return proteinConsumed;
    }

    // Setter methods
    public void setCaloriesConsumed(int caloriesConsumed) {
        this.caloriesConsumed = caloriesConsumed;
    }

    public void setFatConsumed(int fatConsumed) {
        this.fatConsumed = fatConsumed;
    }

    public void setSodiumConsumed(int sodiumConsumed) {
        this.sodiumConsumed = sodiumConsumed;
    }

    public void setCarbs(int carbsConsumed) {
        this.carbsConsumed = carbsConsumed;
    }

    public void setSugarConsumed(int sugarConsumed) {
        this.sugarConsumed = sugarConsumed;
    }

    public void setProteinConsumed(int proteinConsumed) {
        this.proteinConsumed = proteinConsumed;
    }
}
