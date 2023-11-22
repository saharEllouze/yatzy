package com.arolla.yatzy.simple.rules.template;

import com.arolla.yatzy.DiceRoller;

public class ThreesSimpleRuleTemplate extends SimpleRulesTemplate {
    @Override
    protected int simpleMultiply(DiceRoller diceRoller) {
        return diceRoller.getCountsMap()
                .getOrDefault(3, 0L)
                .intValue() * 3;
    }
}