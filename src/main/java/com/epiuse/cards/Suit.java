package com.epiuse.cards;

public enum Suit {
    CLUBS("\u2663"), DIAMONDS("\u2666"), HEARTS("\u2665"), SPADES("\u2660");

    private final String display;

    Suit(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
