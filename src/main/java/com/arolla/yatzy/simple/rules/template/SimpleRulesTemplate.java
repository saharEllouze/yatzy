package com.arolla.yatzy.simple.rules.template;

import com.arolla.yatzy.DiceRoller;

public abstract class SimpleRulesTemplate {
    public int getDiceNumberCount(DiceRoller diceRoller) {
        return simpleMultiply(diceRoller);
    }

    protected abstract int simpleMultiply(DiceRoller diceRoller);
}
