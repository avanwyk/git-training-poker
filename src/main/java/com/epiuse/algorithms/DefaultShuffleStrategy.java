package com.epiuse.algorithms;

import com.epiuse.cards.Card;
import com.epiuse.cards.Deck;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

public final class DefaultShuffleStrategy
        implements ShuffleStrategy {

    @Override
    public Deck shuffle(Deck deck) {
        Random random = new Random(System.nanoTime());

        // Fisher-Yates shuffle
        List<Card> cards = Lists.newArrayList(deck);
        for (int i = deck.size(); i > 1; i--) {
            cards.set(i - 1, cards.set(random.nextInt(i), cards.get(i - 1)));
        }
        return Deck.of(cards);
    }
}
