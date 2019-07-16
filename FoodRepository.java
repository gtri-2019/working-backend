package com.example.myapplication;

//This FoodRepository object contains a hash map of food items

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FoodRepository {

    // Create a hash map
    private HashMap foods = new HashMap();

    // Constructor
    public FoodRepository () {

        //Food Objects
        NutritionFacts cokeNutritionFacts = new NutritionFacts(190, 0, 60, 54, 54, 0);
        String[] cokeTags = {"Drink", "Cola", "Coca-Cola"};
        Food coke = new Food("Coca-Cola", cokeNutritionFacts, cokeTags);
        foods.put(coke.getUUID(), coke);

        NutritionFacts drpepperNutritionFacts = new NutritionFacts(180, 0, 75, 48, 47, 0);
        String[] drpepperTags = {"Drink", "Cola", "Dr Pepper"};
        Food drpepper = new Food( "Dr Pepper", drpepperNutritionFacts, drpepperTags);
        foods.put(drpepper.getUUID(), drpepper);

        NutritionFacts cfaSandwichNutritionFacts = new NutritionFacts(440, 19, 1350, 40, 5, 28);
        String[] cfaSandwichTags = {"Entree", "Sandwich", "Dinner", "Lunch", "Chick Fil A"};
        Food cfaSandwich = new Food( "Chick Fil A Chicken Sandwich", cfaSandwichNutritionFacts, cfaSandwichTags);
        foods.put(cfaSandwich.getUUID(), cfaSandwich);

        NutritionFacts bigMacNutritionFacts = new NutritionFacts(540, 28, 940, 42, 9, 25);
        String[] bigMacTags = {"Entree", "Burger", "Dinner", "Lunch", "McDonalds"};
        Food bigMac = new Food( "McDonalds Big Mac", bigMacNutritionFacts, bigMacTags);
        foods.put(bigMac.getUUID(), cfaSandwich);

        // Get a set of the entries
        Set foodSet = foods.entrySet();
        /*
        // other/test
        int caloriesConsumed = 0;
        String searchValue = scan.nextString();
        boolean flag = Arrays.asList(foods.get(key).tags).contains(searchValue);
        if(flag == true) {
            caloriesConsumed = (caloriesConsumed + foods.get(key).xxx);
        }
            //code to display calories left -> 2000-caloriesConsumed

        // other/test 2
        String needle = "burger"
        for(Map.Entry<String, Food> entry : foods.entrySet()) {
            Food v = entry.getValue();
            if(v.contains(needle))
                caloriesConsumed = (caloriesConsumed + xxx);
        }
        */
    }

    // Getter methods
    public HashMap getFoods() {
        return foods;
    }

    // Setter methods
    public void setFoods(HashMap foods) {
        this.foods = foods;
    }
}