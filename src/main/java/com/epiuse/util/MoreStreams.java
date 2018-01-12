package com.epiuse.util;

import java.util.Optional;
import java.util.stream.Stream;

public final class MoreStreams {

    public static <E> Stream<E> stream(Optional<E> optional) {
        return optional.map(Stream::of).orElse(Stream.empty());
    }

    private MoreStreams() {};
}
