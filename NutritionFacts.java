package com.example.myapplication;

//This NutritionFacts object contains a set of variables.

public class NutritionFacts {
    // Class Variables
    private int calories;
    private int fat;
    private int sodium;
    private int carbs;
    private int sugar;
    private int protein;

    //private int iron;
    //private int calcium;
    //private int vitaminA;
    //private int VitaminC;

    //Constructor
    public NutritionFacts(int calories, int fat, int sodium, int carbs, int sugar, int protein){
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbs = carbs;
        this.sugar = sugar;
        this.protein = protein;
    }

    // Getter methods
    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getSugar() {
        return sugar;
    }

    public int getProtein() {
        return protein;
    }

    // Setter methods
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }
}