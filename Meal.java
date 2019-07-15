package com.example.myapplication;

//This Meal object contains a unique identifier, total nutrition facts, and a timestamp.

import java.util.UUID;
import java.sql.Timestamp;

public class Meal {
    // Class variables
    private String uuid;
    private String name;
    private NutritionFacts totalNutritionFacts;
    private String timestamp;

    // Constructor
    public Meal(String uuid, String name, NutritionFacts totalNutritionFacts, String timestamp) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.totalNutritionFacts = totalNutritionFacts;
        this.timestamp = new Timestamp(System.currentTimeMillis()).toString();
    }

    // Getter methods
    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public NutritionFacts getNutritionFacts() {
        return totalNutritionFacts;
    }

    public String getTimestamp() {
        return timestamp;
    }

    // Setter methods
    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNutritionFacts(NutritionFacts totalNutritionFacts) {
        this.totalNutritionFacts = totalNutritionFacts;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
