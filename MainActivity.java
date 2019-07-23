package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] tagOptions ={
            "Drink","Entree","Side","Burger","Sandwich","McDonalds","Chick Fil A","Fast Food","Lay's","Breakfast",
            "Lunch","Dinner","Panda Express","Cola", "Coca-Cola", "Coke","Waffle","Snack","Dr Pepper","Chicken",
            "Beef","Potato Chips","Potato","Fries","French Fries","Italian","Chinese","Pizza","Pepperoni Pizza","IHOP",
            "Orange Chicken","Asian","Pepperoni","Meatballs","Pasta","Chips"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,tagOptions);

        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
    }
}