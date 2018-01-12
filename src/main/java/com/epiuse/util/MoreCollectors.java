package com.epiuse.util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collector;

public final class MoreCollectors {

    public static  <E> Collector<E, ?, Deque<E>> toDeque() {
        return Collector.of(ArrayDeque::new, Deque::add, (l, r) -> {l.addAll(r); return l;});
    }

    private MoreCollectors() {};
}
