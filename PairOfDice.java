package com.company;

import java.util.Random;

public class PairOfDice {
    private static final Random random = new Random();
    private static final int diceSides = 6;
    private int d1;
    private int d2;

    public PairOfDice() {}

    public int rollDice() {
        d1 = (random.nextInt(diceSides) + 1);
        d2 = (random.nextInt(diceSides) + 1);
        return d1 + d2;
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }
}
