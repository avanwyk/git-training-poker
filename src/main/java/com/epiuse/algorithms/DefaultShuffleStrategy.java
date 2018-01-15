package com.epiuse.algorithms;

import com.epiuse.cards.Card;
import com.epiuse.cards.Deck;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

public final class DefaultShuffleStrategy
    implements ShuffleStrategy {

    @Override
    public Deck shuffle(Deck deck) {
        List<Card> cards = Lists.newArrayList(deck);
        Collections.shuffle(cards);
        return Deck.of(cards);
    }
}
