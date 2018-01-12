package com.epiuse.algorithms;

import com.epiuse.cards.Deck;

public interface ShuffleStrategy {

    static ShuffleStrategy naiveStrategy() {
        return new NaiveShuffleStrategy();
    }

    static ShuffleStrategy defaultStrategy() {
        return new DefaultShuffleStrategy();
    }

    Deck shuffle(Deck deck);
}
