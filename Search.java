package com.example.myapplication;

// This search object has a value checker and an array list

import java.util.ArrayList;
import java.util.Map;

class Search {

    // Class variables
    private ArrayList<Food> matching;


    // Constructor
    Search( ArrayList<Food> matching) {

        this.matching = matching;

        FoodRepository items = new FoodRepository();
        Map<String, Food> foods = items.getFoods();

        //something to set value from user input
        String searchValue = "burger";

        for(Map.Entry<String, Food> entry : foods.entrySet()) {
            Food v = entry.getValue();
            if(v.getTags().contains(searchValue)) {
                matching.add(v);
            }
        }
    }

    // Getter methods
    ArrayList<Food> getMatching() {
        return matching;
    }

    // Setter methods
    void setMatching(ArrayList<Food> matching) {
        this.matching = matching;
    }
}
