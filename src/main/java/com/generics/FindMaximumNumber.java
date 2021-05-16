package com.generics;

public class FindMaximumNumber <T extends Comparable<T>> {
    T x,y,z;

    public FindMaximumNumber() {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable> T DisplayMaximumNo(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum value is:" +max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.println("The Max element is:" +max);
    }
}
