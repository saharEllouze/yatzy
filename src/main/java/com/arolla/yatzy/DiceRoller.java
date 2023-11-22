package com.arolla.yatzy;

import java.util.List;

public class DiceRoller {
    private final List<Integer> dices;

    public DiceRoller(int d1, int d2, int d3, int d4, int d5) {
        this.dices = List.of(d1, d2, d3, d4, d5);
    }
}
