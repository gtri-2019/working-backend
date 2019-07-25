package com.example.myapplication;

class Item {

    private String foodName;
    private String foodCalories;
    private String foodServingSize;
    private int foodImage;

    Item(String foodName, String foodCalories, String foodServingSize, int foodImage)
    {
        this.foodName = foodName;
        this.foodCalories = foodCalories;
        this.foodServingSize = foodServingSize;
        this.foodImage = foodImage;
    }

    // Getter methods
    public String getFoodName()
    {
        return foodName;
    }

    public String getFoodCalories()
    {
        return foodCalories;
    }

    public String getFoodServingSize()
    {
        return foodServingSize;
    }

    public int getFoodImage()
    {
        return foodImage;
    }

    // Setter Methods
    void setFoodName(String calories) {
        this.foodName = foodName;
    }

    void setFoodCalories(String foodCalories) {
        this.foodCalories = foodCalories;
    }

    void setFoodServingSize(String foodServingSize) {
        this.foodServingSize = foodServingSize;
    }

    void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }
}
