package com.example.myapplication;

// This search object has a value checker and an array list

import android.widget.Adapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

class Search {

    // Class variables

    /*private ArrayList<Food> matchingList;
    private ArrayList<String> namesList;
    private ArrayList caloriesList;
    private ArrayList<String> servingSizeList;*/

    private ListView simpleList;
    private ArrayList<Item> foodList;


    // Constructor
    Search( ArrayList<Food> matchingList, ArrayList<String> namesList, ArrayList caloriesList, ArrayList<String> servingSizeList, ListView simpleList, ArrayList<Item> foodList) {

        /*this.matchingList = matchingList;
        this.namesList = namesList;
        this.caloriesList = caloriesList;
        this.servingSizeList = servingSizeList;*/

        this.simpleList = simpleList;
        this.foodList = foodList;

        FoodRepository items = new FoodRepository();
        Map<String, Food> foods = items.getFoods();

        simpleList = (ListView) findViewById(R.id.simpleListView);

        // user input from text view
        String searchValue = "burger";

        for(Map.Entry<String, Food> entry : foods.entrySet()) {
            Food f = entry.getValue();
            if(f.getTags().contains(searchValue)) {
                /*matchingList.add(f);
                namesList.add(f.getName());
                caloriesList.add(f.getNutritionFacts().getCalories());
                servingSizeList.add(f.getNutritionFacts().getServingSize());*/

                foodList.add(new Item(f.getName(), f.getNutritionFacts().getCalories(), f.getNutritionFacts().getServingSize(), f.getImage()));
            }
        }

        Adapter myAdapter = new Adapter(this,R.layout.list_view_items,foodList);
        simpleList.setAdapter(myAdapter);
    }

    // Getter methods
    /*ArrayList<Food> getMatchingList() {
        return matchingList;
    }

    ArrayList<String> getNamesList() {
        return namesList;
    }

    ArrayList getCaloriesList() {
        return caloriesList;
    }

    ArrayList<String> getServingSizeList() {
        return servingSizeList;
    }*/

    ListView getSimpleList(){
        return simpleList;
    }

    ArrayList<Item> getFoodList() {
        return foodList;
    }

    // Setter methods
    /*void setMatchingList(ArrayList<Food> matchingList) {
        this.matchingList = matchingList;
    }

    void setNamesList(ArrayList<String> namesList) {
        this.namesList = namesList;
    }

    void setCalorieList(ArrayList caloriesList) {
        this.caloriesList = caloriesList;
    }

    void setServingSizeList (ArrayList<String> servingSizeList) {
        this.servingSizeList = servingSizeList;
    }*/

    void setSimpleList() {
        this.simpleList = simpleList;
    }

    void setFoodList() {
        this.foodList = foodList;
    }
}
