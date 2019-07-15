package com.example.myapplication;

//This Food object contains a unique identifier, nutrition facts, and searchable tags.

import java.util.UUID;

public class Food {
    // Class variables
    private String uuid;
    private String name;
    private NutritionFacts nutritionFacts;
    private String tag;
    private String tag2;

    // Constructor
    public Food(String name, NutritionFacts nutritionFacts, String tag, String tag2) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.nutritionFacts = nutritionFacts;
        this.tag = tag;
        this.tag2 = tag2;
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

    public String getTag() {
        return tag;
    }

    public String getTag2() {
        return tag2;
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

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setTag2(String tag2) {
        this.tag = tag2;
    }
}
