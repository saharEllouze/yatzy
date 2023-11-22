package com.arolla.yatzy.pair.rules.template;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ThreeOfAKindTemplate extends PairRulesTemplate {

    @Override
    protected Predicate<Map.Entry<Integer, Long>> getFilterPredicate() {
        return (entry -> entry.getValue() >= 3);
    }

    @Override
    protected int multiply(int maxOfKeys) {
        return maxOfKeys * 3;
    }

    @Override
    protected List<Integer> checkKeys(List<Integer> keys) {
        return keys;
    }

    @Override
    protected Integer maxOrSum(IntStream intStream) {
        return intStream.max().orElse(0);
    }
}
