package com.arolla.yatzy.pair.rules.template;

import com.arolla.yatzy.DiceRoller;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class PairRulesTemplate {

    public int maxOrSumDuplicate(DiceRoller diceRoller) {
        List<Integer> keys = getKeys(diceRoller);
        keys = checkKeys(keys);
        return multiply(maxOrSum(
                keys.stream().mapToInt(value -> value)));
    }

    protected abstract List<Integer> checkKeys(List<Integer> keys);

    protected abstract Integer maxOrSum(IntStream intStream);

    protected abstract Predicate<Map.Entry<Integer, Long>> getFilterPredicate();

    protected abstract int multiply(int maxOfKeys);

    private static Stream<Map.Entry<Integer, Long>> getCountMapStream(DiceRoller diceRoller) {
        return diceRoller.getCountsMap().entrySet()
                .stream();
    }

    private List<Integer> getKeys(DiceRoller diceRoller) {
        return getCountMapStream(diceRoller)
                .filter(getFilterPredicate())
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

}
