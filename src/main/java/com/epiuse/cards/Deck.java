package com.epiuse.cards;

import com.epiuse.util.MoreCollectors;
import com.epiuse.util.MoreStreams;
import com.google.common.collect.ForwardingCollection;

import java.util.*;
import java.util.stream.IntStream;

import static com.epiuse.util.MoreCollectors.toDeque;
import static com.google.common.base.Preconditions.checkArgument;

public class Deck
        extends ForwardingCollection<Card> {

    private static final int DECK_LOWER_BOUND = 0;

    private final Deque<Card> cards;

    public static Deck fullDeck() {
        return new Deck(Arrays.stream(Suit.values())
                              .flatMap(suit -> Arrays.stream(FaceValue.values()).map(value -> Card.of(suit, value)))
                              .collect(toDeque()));
    }

    public static Deck emptyDeck() {
        return new Deck(new ArrayDeque<>());

    }

    private Deck(Deque<Card> cards) {
        this.cards = cards;
    }

    public Optional<Card> draw() {
        return Optional.ofNullable(cards.pollFirst());
    }

    public Deque<Card> draw(int size) {
        checkArgument(this.size() >= size);

        return IntStream.range(DECK_LOWER_BOUND, size).boxed()
                        .flatMap(c -> MoreStreams.stream(draw()))
                        .collect(MoreCollectors.toDeque());
    }


    protected Collection<Card> delegate() {
        return cards;
    }
}
