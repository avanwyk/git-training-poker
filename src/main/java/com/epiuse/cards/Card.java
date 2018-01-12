package com.epiuse.cards;

import java.util.Objects;

public final class Card {
    private final Suit suit;
    private final FaceValue value;

    public static Card of(Suit suit, FaceValue value) {
        return new Card(suit, value);
    }

    private Card(
            Suit suit,
            FaceValue value
    ) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Card)) {
            return false;
        }
        Card card = (Card) o;
        return suit == card.suit &&
                value == card.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    @Override
    public String toString() {
        return value.toString() + suit;
    }
}
