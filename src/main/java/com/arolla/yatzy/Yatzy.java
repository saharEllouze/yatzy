package com.arolla.yatzy;

import java.util.List;
import java.util.stream.Collectors;

public class Yatzy {

    private static final int YATZY_SCORE = 50;
    private static final int SMALL_STRAIGHT_SCORE = 15;
    private static final int LARGE_STRAIGHT_SCORE = 20;

    public static int chance(DiceRoller diceRoller) {
        return diceRoller.sum();
    }

    public static int yatzy(DiceRoller diceRoller) {
        return diceRoller.isYatzy() ? YATZY_SCORE : 0;
    }

    public static int ones(DiceRoller diceRoller) {
        return diceRoller.getDiceNumberCount(1);
    }

    public static int twos(DiceRoller diceRoller) {
        return diceRoller.getDiceNumberCount(2);
    }

    public static int threes(DiceRoller diceRoller) {
        return diceRoller.getDiceNumberCount(3);
    }

    public static int fours(DiceRoller diceRoller) {
        return diceRoller.getDiceNumberCount(4);
    }

    public static int fives(DiceRoller diceRoller) {
        return diceRoller.getDiceNumberCount(5);
    }

    public static int sixes(DiceRoller diceRoller) {
        return diceRoller.getDiceNumberCount(6);
    }

    public static int pair(DiceRoller diceRoller) {
        return diceRoller.sumDuplicate(2);
    }

    public static int twoPairs(DiceRoller diceRoller) {
        return diceRoller.findTwoPairs();
    }

    public static int threeOfAKind(DiceRoller diceRoller) {
        return diceRoller.sumDuplicate(3);
    }

    public static int fourOfAKind(DiceRoller diceRoller) {
        return diceRoller.sumDuplicate(4);
    }

    public static int smallStraight(DiceRoller diceRoller) {
        return diceRoller.isSmallStraight() ? SMALL_STRAIGHT_SCORE : 0;
    }

    public static int largeStraight(DiceRoller diceRoller) {
        return diceRoller.isLargeStraight() ? LARGE_STRAIGHT_SCORE : 0;
    }

    public static int fullHouse(DiceRoller diceRoller) {
        return diceRoller.isAFullHouse()? diceRoller.sum() : 0;
    }
}