package com.arolla.yatzy.small.large.template;

import java.util.List;

public class LargeTemplate extends SmallOrLargeTemplate {

    private static final List<Integer> LARGEST_STRAIGHT_LIST = List.of(2, 3, 4, 5, 6);
    private static final int LARGE_STRAIGHT_SCORE = 20;

    @Override
    protected int smallOrLargestStraight(List<Integer> listStraight) {
        return listStraight.equals(LARGEST_STRAIGHT_LIST) ? LARGE_STRAIGHT_SCORE : 0;
    }
}
