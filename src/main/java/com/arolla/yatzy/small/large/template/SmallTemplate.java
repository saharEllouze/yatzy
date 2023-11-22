package com.arolla.yatzy.small.large.template;

import java.util.List;

public class SmallTemplate extends SmallOrLargeTemplate {

    private static final List<Integer> SMALL_STRAIGHT_LIST = List.of(1, 2, 3, 4, 5);
    private static final int SMALL_STRAIGHT_SCORE = 15;

    @Override
    protected int smallOrLargestStraight(List<Integer> listStraight) {
        return listStraight.equals(SMALL_STRAIGHT_LIST) ? SMALL_STRAIGHT_SCORE : 0;
    }
}