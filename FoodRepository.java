package com.example.myapplication;

//This FoodRepository object contains a hash map of food items

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodRepository {

    // Create a hash map
    private Map<String, Food> foods = new HashMap<>();

    // Constructor
    public FoodRepository () {

        //Food Objects
        NutritionFacts cokeNutritionFacts = new NutritionFacts(190, 0, 60, 54, 54, 0);
        List<String> cokeTags = Arrays.asList("Drink", "Cola", "Coca-Cola");
        Food coke = new Food("Coca-Cola", cokeNutritionFacts, cokeTags);
        foods.put(coke.getUUID(), coke);

        NutritionFacts drpepperNutritionFacts = new NutritionFacts(180, 0, 75, 48, 47, 0);
        List<String> drpepperTags = Arrays.asList("Drink", "Cola", "Dr Pepper");
        Food drpepper = new Food( "Dr Pepper", drpepperNutritionFacts, drpepperTags);
        foods.put(drpepper.getUUID(), drpepper);

        NutritionFacts cfaSandwichNutritionFacts = new NutritionFacts(440, 19, 1350, 40, 5, 28);
        List<String> cfaSandwichTags = Arrays.asList("Entree", "Sandwich", "Dinner", "Lunch", "Chick Fil A");
        Food cfaSandwich = new Food( "Chick Fil A Chicken Sandwich", cfaSandwichNutritionFacts, cfaSandwichTags);
        foods.put(cfaSandwich.getUUID(), cfaSandwich);

        NutritionFacts bigMacNutritionFacts = new NutritionFacts(540, 28, 940, 42, 9, 25);
        List<String> bigMacTags = Arrays.asList("Entree", "Burger", "Dinner", "Lunch", "McDonalds");
        Food bigMac = new Food( "McDonalds Big Mac", bigMacNutritionFacts, bigMacTags);
        foods.put(bigMac.getUUID(), bigMac);
    }

    // Getter methods
    public Map<String, Food> getFoods() {
        return foods;
    }

    // Setter methods
    public void setFoods(Map<String, Food> foods) {
        this.foods = foods;
    }
}