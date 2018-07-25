package com.javacards;

import java.util.*;

public class Card {
    private final Rank rank;
    private final Suit suit;
    protected enum Rank { two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace }
    protected enum Suit { clubs, diamonds, hearts, spades }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getName() {
        return this.getRank() + " of " + this.getSuit();
    }

    public static List<Rank> getAllRanks() {
        List<Rank> allRanks = Arrays.asList(Rank.values());
        return allRanks;
    }

    public static List<Suit> getAllSuits() {
        List<Suit> allSuits = Arrays.asList(Suit.values());
        return allSuits;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        int value = 0;
        switch (getRank()) {
            case two:
                value = 2;
                break;
            case three:
                value = 3;
                break;
            case four:
                value = 4;
                break;
            case five:
                value = 5;
                break;
            case six:
                value = 6;
                break;
            case seven:
                value = 7;
                break;
            case eight:
                value = 8;
                break;
            case nine:
                value = 9;
                break;
            case ten:
                value = 10;
                break;
            case jack:
                value = 11;
                break;
            case queen:
                value = 12;
                break;
            case king:
                value = 13;
                break;
            case ace:
                value = 14;
                break;
        }
        return value;
    }
}
