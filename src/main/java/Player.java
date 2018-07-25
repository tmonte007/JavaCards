package com.javacards;

import java.util.ArrayList;

public class Player {
    private String firstName;
    private String lastName;
    public ArrayList<Card> currentHand = new ArrayList<Card>();
    public int currentValue;


    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentHand = new ArrayList<Card>();
        this.currentValue = 0;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Card> getCurrentHand() {
        return currentHand;
    }
}
