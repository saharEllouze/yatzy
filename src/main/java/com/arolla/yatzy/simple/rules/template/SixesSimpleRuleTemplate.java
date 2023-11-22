package com.arolla.yatzy.simple.rules.template;

import com.arolla.yatzy.DiceRoller;

public class SixesSimpleRuleTemplate extends SimpleRulesTemplate {
    @Override
    protected int simpleMultiply(DiceRoller diceRoller) {
        return diceRoller.getCountsMap()
                .getOrDefault(6, 0L)
                .intValue() * 6;
    }
}