package com.epiuse.algorithms;

import com.epiuse.cards.Deck;

public interface ShuffleStrategy {

    Deck shuffle(Deck deck);
}
