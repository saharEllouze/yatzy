package com.arolla.yatzy;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DiceRoller {
    private final List<Integer> dices;

    public DiceRoller(int d1, int d2, int d3, int d4, int d5) {
        this.dices = List.of(d1, d2, d3, d4, d5);
    }

    public int sum() {
        return dices.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public Map<Integer, Long> getCountsMap() {
        return dices.stream()
                .collect(groupingBy(identity(), counting()));
    }

    public int getDiceNumberCount(int diceNumber) {
        return getCountsMap()
                .getOrDefault(diceNumber, 0L)
                .intValue() * diceNumber;
    }

    public int sumDuplicate(int numberOfAppearance) {
        return getCountsMap().entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= numberOfAppearance)
                .mapToInt(entry -> entry.getKey())
                .max()
                .orElse(0) * numberOfAppearance;
    }
}
