package com.example.myapplication;

//This Food object contains a unique identifier, nutrition facts, and searchable tags.

import java.util.UUID;

public class Food {
    // Class variables
    private String uuid;
    private String name;
    private NutritionFacts nutritionFacts;
    private String[] tags;

    // Constructor
    public Food(String name, NutritionFacts nutritionFacts, String[] tags) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.nutritionFacts = nutritionFacts;
        this.tags = tags;
    }

    // Getter methods
    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public String[] getTags() {
        return tags;
    }

    // Setter methods
    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public void setTags(String[] tag) {
        this.tags = tags;
    }
}