package com.arolla.yatzy.simple.rules.template;

import com.arolla.yatzy.DiceRoller;

public class OnesSimpleRuleTemplate extends SimpleRulesTemplate {
    @Override
    protected int simpleMultiply(DiceRoller diceRoller) {
        return diceRoller.getCountsMap()
                .getOrDefault(1, 0L)
                .intValue() * 1;
    }
}

