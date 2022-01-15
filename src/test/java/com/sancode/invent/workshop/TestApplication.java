package com.sancode.invent.workshop;

import java.util.function.UnaryOperator;

/**
 *
 */
public class TestApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        UnaryOperator<Integer> square  = (i)->i*i;
        System.out.println(square.apply(2));
    }
}
