package com.arolla.yatzy.simple.rules.template;

import com.arolla.yatzy.DiceRoller;

public class FivesSimpleRuleTemplate extends SimpleRulesTemplate {
    @Override
    protected int simpleMultiply(DiceRoller diceRoller) {
        return diceRoller.getCountsMap()
                .getOrDefault(5, 0L)
                .intValue() * 5;
    }
}