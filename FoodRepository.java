package com.example.myapplication;

//This FoodRepository object contains a hash map of food items

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FoodRepository {

    // Create a hash map
    private Map<String, Food> foods = new HashMap<>();

    // Constructor
    FoodRepository() {

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

        NutritionFacts waffleNutritionFacts = new NutritionFacts(590, 29, 740, 69, 17, 11);
        List<String> waffleTags = Arrays.asList("Entree", "Waffle", "Dinner", "Lunch", "Breakfast", "IHOP");
        Food waffle = new Food( "IHOP Belgian Waffle", waffleNutritionFacts, waffleTags);
        foods.put(waffle.getUUID(), waffle);

        NutritionFacts laysClassicNutritionFacts = new NutritionFacts(160, 10, 170, 15, 0, 2);
        List<String> laysClassicTags = Arrays.asList("Side", "Chips", "Dinner", "Lunch", "Snack", "Lay's");
        Food laysClassic = new Food( "Lay's Classic Potato Chips", laysClassicNutritionFacts, laysClassicTags);
        foods.put(laysClassic.getUUID(), laysClassic);
    }

    // Getter methods
    Map<String, Food> getFoods() {
        return foods;
    }

    // Setter methods
    void setFoods(Map<String, Food> foods) {
        this.foods = foods;
    }
}