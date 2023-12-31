package com.arolla.yatzy;

import com.arolla.yatzy.pair.rules.template.ThreeOfAKindTemplate;
import com.arolla.yatzy.pair.rules.template.TwoPairsTemplate;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class DiceRoller {

    private final List<Integer> dices;

    public DiceRoller(int d1, int d2, int d3, int d4, int d5) {
        this.dices = List.of(d1, d2, d3, d4, d5);
    }

    public List<Integer> getDices() {
        return dices;
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

    public boolean isYatzy() {
        return getCountsMap().size() == 1;
    }

    public boolean isAFullHouse() {
        ThreeOfAKindTemplate threeOfAKindTemplate = new ThreeOfAKindTemplate();
        TwoPairsTemplate twoPairsTemplate = new TwoPairsTemplate();
        return threeOfAKindTemplate.maxOrSumDuplicate(this) != 0 && twoPairsTemplate.maxOrSumDuplicate(this) != 0 && !this.isYatzy();
    }
}
