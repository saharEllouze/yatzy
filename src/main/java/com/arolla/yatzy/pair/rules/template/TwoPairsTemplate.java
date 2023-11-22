package com.arolla.yatzy.pair.rules.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class TwoPairsTemplate extends PairRulesTemplate {

    @Override
    protected Predicate<Map.Entry<Integer, Long>> getFilterPredicate() {
        return (entry -> entry.getValue() >= 2);
    }

    @Override
    protected int multiply(int maxOfKeys) {
        return maxOfKeys * 2;
    }

    @Override
    protected List<Integer> checkKeys(List<Integer> keys) {
        if (keys.size() != 1) {
            return keys;
        } else {
            return new ArrayList();
        }
    }

    @Override
    protected Integer maxOrSum(IntStream intStream) {
        return intStream.sum();

    }

}
