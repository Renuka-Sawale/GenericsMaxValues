package com.generics;

public class FindMaximumNumber <E extends Comparable<E>> {
    public static <E extends Comparable> E DisplayMaximumNo(E x, E y, E z) {
        E max = x; // max = 15(x)
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum value is:" +max);
        return max;
    }
}
