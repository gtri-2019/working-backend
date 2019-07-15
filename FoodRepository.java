package com.example.myapplication;

//This FoodRepository object contains a hashmap of food items

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FoodRepository {

    // Create a hash map
    private HashMap foods = new HashMap();

    // Constructor
    public FoodRepository () {

        //Food Objects
        NutritionFacts cokeNutritionFacts = new NutritionFacts(190, 0, 60, 54, 54, 0);
        Food coke = new Food("Coca-Cola", cokeNutritionFacts, "Drink", "Coca-Cola");
        foods.put(coke.getUUID(), coke);

        NutritionFacts drpepperNutritionFacts = new NutritionFacts(180, 0, 75, 48, 47, 0);
        Food drpepper = new Food( "Dr Pepper", drpepperNutritionFacts, "Drink", "Dr Pepper");
        foods.put(drpepper.getUUID(), drpepper);

        NutritionFacts cfaSandwichNutritionFacts = new NutritionFacts(180, 0, 75, 48, 47, 0);
        Food cfaSandwich = new Food( "Chick Fil A Chicken Sandwich", cfaSandwichNutritionFacts, "Entree", "Chick Fil A");
        foods.put(cfaSandwich.getUUID(), cfaSandwich);

        // Get a set of the entries
        Set set = foods.entrySet();

        // Get an iterator
        Iterator i = set.iterator();
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