package com.example.myapplication;

// This search object has a value checker and an array list

import java.util.ArrayList;
import java.util.Map;

class Search {

    // Class variables
    private ArrayList<Food> matchingList;
    private ArrayList<String> namesList;
    private ArrayList caloriesList;


    // Constructor
    Search( ArrayList<Food> matchingList, ArrayList<String> namesList, ArrayList caloriesList) {

        this.matchingList = matchingList;
        this.namesList = namesList;
        this.caloriesList = caloriesList;

        FoodRepository items = new FoodRepository();
        Map<String, Food> foods = items.getFoods();

        //something to set value from user input
        String searchValue = "burger";

        for(Map.Entry<String, Food> entry : foods.entrySet()) {
            Food v = entry.getValue();
            if(v.getTags().contains(searchValue)) {
                matchingList.add(v);
                namesList.add(v.getName());
                caloriesList.add(v.getNutritionFacts().getCalories());
            }
        }
    }

    // Getter methods
    ArrayList<Food> getMatchingList() {
        return matchingList;
    }
    ArrayList<String> getNamesList() {
        return namesList;
    }
    ArrayList getCaloriesList() {
        return caloriesList;
    }

    // Setter methods
    void setMatchingList(ArrayList<Food> matchingList) {
        this.matchingList = matchingList;
    }
    void setNamesList(ArrayList<String> namesList) {
        this.namesList = namesList;
    }
    void setCalorieList(ArrayList caloriesList) {
        this.caloriesList = caloriesList;
    }
}
