package com.arolla.yatzy;

import com.arolla.yatzy.pair.rules.template.FourOfAKindTemplate;
import com.arolla.yatzy.pair.rules.template.PairTemplate;
import com.arolla.yatzy.pair.rules.template.ThreeOfAKindTemplate;
import com.arolla.yatzy.pair.rules.template.TwoPairsTemplate;
import com.arolla.yatzy.simple.rules.template.*;

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
        OnesSimpleRuleTemplate oneSimpleRuleTemplate = new OnesSimpleRuleTemplate();
        return oneSimpleRuleTemplate.getDiceNumberCount(diceRoller);
    }

    public static int twos(DiceRoller diceRoller) {
        TwosSimpleRuleTemplate towsSimpleRuleTemplate = new TwosSimpleRuleTemplate();
        return towsSimpleRuleTemplate.getDiceNumberCount(diceRoller);
    }

    public static int threes(DiceRoller diceRoller) {
        ThreesSimpleRuleTemplate threesSimpleRuleTemplate = new ThreesSimpleRuleTemplate();
        return threesSimpleRuleTemplate.getDiceNumberCount(diceRoller);
    }

    public static int fours(DiceRoller diceRoller) {
        FoursSimpleRuleTemplate foursSimpleRuleTemplate = new FoursSimpleRuleTemplate();
        return foursSimpleRuleTemplate.getDiceNumberCount(diceRoller);
    }

    public static int fives(DiceRoller diceRoller) {
        FivesSimpleRuleTemplate fivesSimpleRuleTemplate = new FivesSimpleRuleTemplate();
        return fivesSimpleRuleTemplate.getDiceNumberCount(diceRoller);
    }

    public static int sixes(DiceRoller diceRoller) {
        SixesSimpleRuleTemplate sixesSimpleRuleTemplate = new SixesSimpleRuleTemplate();
        return sixesSimpleRuleTemplate.getDiceNumberCount(diceRoller);
    }

    public static int pair(DiceRoller diceRoller) {
        PairTemplate pairTemplate = new PairTemplate();
        return pairTemplate.maxOrSumDuplicate(diceRoller);
    }

    public static int twoPairs(DiceRoller diceRoller) {
        TwoPairsTemplate twoPairsTemplate = new TwoPairsTemplate();
        return twoPairsTemplate.maxOrSumDuplicate(diceRoller);
    }

    public static int threeOfAKind(DiceRoller diceRoller) {
        ThreeOfAKindTemplate threeOfAKindTemplate = new ThreeOfAKindTemplate();
        return threeOfAKindTemplate.maxOrSumDuplicate(diceRoller);
    }

    public static int fourOfAKind(DiceRoller diceRoller) {
        FourOfAKindTemplate fourOfAKindTemplate = new FourOfAKindTemplate();
        return fourOfAKindTemplate.maxOrSumDuplicate(diceRoller);
    }

    public static int smallStraight(DiceRoller diceRoller) {
        return diceRoller.isSmallStraight() ? SMALL_STRAIGHT_SCORE : 0;
    }

    public static int largeStraight(DiceRoller diceRoller) {
        return diceRoller.isLargeStraight() ? LARGE_STRAIGHT_SCORE : 0;
    }

    public static int fullHouse(DiceRoller diceRoller) {
        return diceRoller.isAFullHouse() ? diceRoller.sum() : 0;
    }
}