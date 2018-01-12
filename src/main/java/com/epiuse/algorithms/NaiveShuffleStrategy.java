package com.epiuse.algorithms;

import com.epiuse.cards.Card;
import com.epiuse.cards.Deck;
import com.google.common.collect.Lists;

import java.util.List;

public class NaiveShuffleStrategy
        implements ShuffleStrategy {

    @Override
    public Deck shuffle(Deck deck) {
        List<Card> cards = Lists.newArrayList(deck);
        return Deck.of(Lists.reverse(cards));
    }
}
