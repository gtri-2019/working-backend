package com.example.myapplication;

//This User object contains variables and a unique identifier. -- OUT OF USE

import java.util.UUID;

class User {

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
    User(String uuid, String name, boolean notifications) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.notifications = notifications;
        notifications = true;
    }

    // Getter methods
    String getUUID() {
        return uuid;
    }

    String getName() {
        return name;
    }

    boolean getNotifications(){
        return notifications;
    }

    // Setter methods
    void setUUID(String uuid) {
        this.uuid = uuid;
    }

    void setName(String name) {
        this.name = name;
    }

    void setNotifications(boolean notifications){
        this.notifications = notifications;
    }

    //meal history
}