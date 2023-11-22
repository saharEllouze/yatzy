package com.arolla.yatzy.simple.rules.template;

import com.arolla.yatzy.DiceRoller;

public class TwosSimpleRuleTemplate extends SimpleRulesTemplate {
    @Override
    protected int simpleMultiply(DiceRoller diceRoller) {
        return diceRoller.getCountsMap()
                .getOrDefault(2, 0L)
                .intValue() * 2;
    }
}
