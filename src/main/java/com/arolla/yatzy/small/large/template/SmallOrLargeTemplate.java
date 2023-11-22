package com.arolla.yatzy.small.large.template;

import com.arolla.yatzy.DiceRoller;

import java.util.List;

import static java.util.stream.Collectors.toList;

public abstract class SmallOrLargeTemplate {

    public int checkTypeStraight(DiceRoller diceRoller) {
        return smallOrLargestStraight(getListDicesSorted(diceRoller));
    }

    protected abstract int smallOrLargestStraight(List<Integer> listStraight);

    private static List<Integer> getListDicesSorted(DiceRoller diceRoller) {
        return diceRoller.getDices().stream()
                .sorted()
                .collect(toList());
    }

}
