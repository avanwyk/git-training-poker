package com.epiuse.cards;

import com.google.common.collect.ForwardingCollection;

import java.util.Collection;
import java.util.Deque;
import java.util.Objects;

public final class Hand extends ForwardingCollection<Card> {

    private final static int FIVE_CARD_DRAW_SIZE = 5;

    private final Deque<Card> hand;

    public static Hand fiveCardDraw(Deck deck) {
        return new Hand(deck.draw(FIVE_CARD_DRAW_SIZE));
    }

    private Hand(Deque<Card> hand) {
        this.hand = hand;
    }

    @Override
    protected Collection<Card> delegate() {
        return hand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Hand)) {
            return false;
        }
        Hand cards = (Hand) o;
        return Objects.equals(hand, cards.hand);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hand);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        hand.forEach(c -> sb.append(c.toString()).append(" "));
        return sb.toString();
    }
}
