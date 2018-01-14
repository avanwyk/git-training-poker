package com.epiuse.cards;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

    @Test
    public void shouldHave52CardsInFullDeck() {
        Deck cards = Deck.fullDeck();

        Assert.assertEquals(52L, cards.size());
    }

}