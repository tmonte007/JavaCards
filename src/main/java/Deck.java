package com.javacards;

import static com.javacards.Card.*;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public ArrayList<Card> freshDeck = new ArrayList<Card>(52);
    public ArrayList<Card> unfreshDeck = new ArrayList<Card>(52);

    public Deck() {
        this.freshDeck = getDeck();
        shuffle(this.freshDeck);
        this.unfreshDeck = new ArrayList<Card>();
    }

    public ArrayList<Card> dealCards(int numberOfCards) {
        ArrayList<Card> deltCards = new ArrayList<Card>();

        while (numberOfCards > 0) {
            if (this.freshDeck.isEmpty()) {
                this.freshDeck = getDeck();
                shuffle(this.freshDeck);
            }

            Card card = this.freshDeck.get(0);
            this.freshDeck.remove(card);
            this.unfreshDeck.add(card);
            deltCards.add(card);
            numberOfCards--;
        }
        return deltCards;
    }

    public static final ArrayList<Card> getDeck() {
        ArrayList<Card> deck = new ArrayList<Card>(52);
        for (Suit suit : Card.getAllSuits()) {
            for (Rank rank : Card.getAllRanks()) {
                Card newCard = new Card(rank, suit);
                deck.add(newCard);
                newCard = null;
            }
        }
        return(deck);
    }

    public static ArrayList<Card> shuffle(ArrayList<Card> unshuffledDeck){
        Collections.shuffle(unshuffledDeck);
        return unshuffledDeck;
    }
}