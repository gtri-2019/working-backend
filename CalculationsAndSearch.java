package com.example.myapplication;

//This Food object contains a unique identifier, nutrition facts, and searchable tags.

import java.util.ArrayList;
import java.util.Map;

class CalculationsAndSearch {

    // Class variables
    private int caloriesConsumed;
    private int fatConsumed;
    private int sodiumConsumed;
    private int carbsConsumed;
    private int sugarConsumed;
    private int proteinConsumed;
    private ArrayList<Food> matching;


    // Constructor
    CalculationsAndSearch(int caloriesConsumed, int fatConsumed, int sodiumConsumed, int carbsConsumed, int sugarConsumed, int proteinConsumed, ArrayList<Food> matching) {

        this.caloriesConsumed = caloriesConsumed;
        this.fatConsumed = fatConsumed;
        this.sodiumConsumed = sodiumConsumed;
        this.carbsConsumed = carbsConsumed;
        this.sugarConsumed = sugarConsumed;
        this.proteinConsumed = proteinConsumed;
        this.matching = matching;

        FoodRepository items = new FoodRepository();
        Map<String, Food> foods = items.getFoods();

        //something to set value from user input
        String searchValue = "burger";

        for(Map.Entry<String, Food> entry : foods.entrySet()) {
            Food v = entry.getValue();
            if(v.getTags().contains(searchValue)) {
                matching.add(v);
            }
        }

        //something about choosing item
        Food display = matching.get(0);

        caloriesConsumed = (caloriesConsumed + display.getNutritionFacts().getCalories());
        fatConsumed = (fatConsumed + display.getNutritionFacts().getFat());
        sodiumConsumed = (sodiumConsumed + display.getNutritionFacts().getSodium());
        carbsConsumed = (carbsConsumed + display.getNutritionFacts().getCarbs());
        sugarConsumed = (sugarConsumed + display.getNutritionFacts().getSugar());
        proteinConsumed = (proteinConsumed + display.getNutritionFacts().getProtein());

    }

    // Getter methods
    int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    int getFatConsumed() {
        return fatConsumed;
    }

    int getSodiumConsumed() {
        return sodiumConsumed;
    }

    int getCarbsConsumed() {
        return carbsConsumed;
    }

    int getSugarConsumed() {
        return sugarConsumed;
    }

    int getProteinConsumed() {
        return proteinConsumed;
    }

    ArrayList<Food> getMatching() {
        return matching;
    }

    // Setter methods
    void setCaloriesConsumed(int caloriesConsumed) {
        this.caloriesConsumed = caloriesConsumed;
    }

    void setFatConsumed(int fatConsumed) {
        this.fatConsumed = fatConsumed;
    }

    void setSodiumConsumed(int sodiumConsumed) {
        this.sodiumConsumed = sodiumConsumed;
    }

    void setCarbs(int carbsConsumed) {
        this.carbsConsumed = carbsConsumed;
    }

    void setSugarConsumed(int sugarConsumed) {
        this.sugarConsumed = sugarConsumed;
    }

    void setProteinConsumed(int proteinConsumed) {
        this.proteinConsumed = proteinConsumed;
    }

    void setMatching(ArrayList<Food> matching) {
        this.matching = matching;
    }
}
