package com.arolla.yatzy;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class DiceRoller {

    private final List<Integer> dices;
    private static final List<Integer> SMALL_STRAIGHT_LIST = List.of(1, 2, 3, 4, 5);
    private static final List<Integer> LARGEST_STRAIGHT_LIST = List.of(2, 3, 4, 5, 6);

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

    public int findTwoPairs() {
        List<Integer> listOfDice = getCountsMap().entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(entry -> entry.getKey())
                .collect(toList());
        if (listOfDice.size() != 1) {
            return listOfDice.stream().mapToInt(value -> value).sum() * 2;
        } else {
            return 0;
        }
    }

    public boolean isSmallStraight() {
        return dices.stream()
                .sorted()
                .collect(toList())
                .equals(SMALL_STRAIGHT_LIST);
    }

    public boolean isLargeStraight() {
        return dices.stream()
                .sorted()
                .collect(toList())
                .equals(LARGEST_STRAIGHT_LIST);
    }
}
