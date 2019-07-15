package com.example.myapplication;

//This User object contains variables and a unique identifier

import java.util.UUID;

public class User {

    // Class variables
    private String uuid;
    private String name;
    private boolean notifications;
    /*
    private String name;
    private int age;
    //private enum sex;
    private float weight;
    private float goal weight;
    */

    // Constructor
    public User(String uuid, String name, boolean notifications) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.notifications = notifications;
        notifications = true;
    }

    // Getter methods
    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public boolean getNotifications(){
        return notifications;
    }

    // Setter methods
    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotifications(boolean notifications){
        this.notifications = notifications;
    }

    //meal history
}