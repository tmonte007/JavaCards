package com.javacards;

import java.util.ArrayList;

public class HighCardGame {
    public static void main(String ... args){
        Deck myDeck = new Deck();
        Player Tom = new Player("Tom", "Monte");
        Player Justin = new Player("Justin", "Bonomo");

        Tom.currentHand = myDeck.dealCards(5);
        for (Card myCard : Tom.currentHand) {
            System.out.println(myCard.getName());
        }

        System.out.println("\n----\n");

        Justin.currentHand = myDeck.dealCards(5);
        for (Card myCard : Tom.currentHand) {
            System.out.println(myCard.getName());
        }

        System.out.println("\n----\n");

        if (calculateHighCard(Tom.currentHand) > calculateHighCard(Justin.currentHand)) {
            System.out.println("Tom won the game!");
        } else if (calculateHighCard(Tom.currentHand) < calculateHighCard(Justin.currentHand)) {
            System.out.println("Justin won the game!");
        } else if (calculateHighCard(Tom.currentHand) == calculateHighCard(Justin.currentHand)) {
            System.out.println("It was a tie!");
        }
    }

    public static int calculateHighCard(ArrayList<Card> cards) {
        int handValue = 0;
        for (Card card : cards) {
            if (card.getValue() > handValue) {
                handValue = card.getValue();
            }
        }
        return handValue;
    }
}
