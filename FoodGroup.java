package com.example.myapplication;

// This FoodGroup object contains a unique identifier and a timestamp.

import java.util.UUID;

public class FoodGroup {

    // Class variables
    private String uuid;
    private String name;
    private NutritionFacts nutritionFacts;
    private String tag;

    // Constructor
    public FoodGroup(String uuid, String name, NutritionFacts nutritionFacts, String tag) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.nutritionFacts = nutritionFacts;
        this.tag = tag;
    }

    // Getter methods
    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}