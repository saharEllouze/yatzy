package com.arolla.yatzy.simple.rules.template;

import com.arolla.yatzy.DiceRoller;

public class FoursSimpleRuleTemplate extends SimpleRulesTemplate {
    @Override
    protected int simpleMultiply(DiceRoller diceRoller) {
        return diceRoller.getCountsMap()
                .getOrDefault(4, 0L)
                .intValue() * 4;
    }
}
