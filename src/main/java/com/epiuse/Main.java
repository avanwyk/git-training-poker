package com.epiuse;

import com.epiuse.cards.Deck;
import com.epiuse.cards.Hand;

public class Main {

    public static final String outputBreak = "==================";

    public static void main(String[] args) {
        System.out.println(outputBreak);

        Deck deck = Deck.fullDeck().shuffle();

        Hand hand = Hand.fiveCardDraw(deck);

        System.out.println(hand);
        System.out.println(deck);

        System.out.println(outputBreak);
    }
}
