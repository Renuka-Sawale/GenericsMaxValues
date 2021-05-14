package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNoTest {

    @Test
    public void givenIntegerValueMaxAtFirstPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        Integer result = maximumNo.DisplayIntegerMaximumNo(15, 10, 5);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void givenIntegerValueMaxAtSecondPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        Integer result = maximumNo.DisplayIntegerMaximumNo(5, 15, 10);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void givenIntegerValueMaxAtThirdPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        Integer result = maximumNo.DisplayIntegerMaximumNo(5, 10, 15);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void givenDoubleValueMaxAtFirstPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        Double result = maximumNo.DisplayDoubleMaximumNo(15.2, 10.2, 5.2);
        Assertions.assertEquals(15.2, result);
    }

    @Test
    public void givenDoubleValueMaxAtSecondPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        Double result = maximumNo.DisplayDoubleMaximumNo(5.2, 15.2, 10.2);
        Assertions.assertEquals(15.2, result);
    }

    @Test
    public void givenDoubleValueMaxAtThirdPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        Double result = maximumNo.DisplayDoubleMaximumNo(5.2, 10.2, 15.2);
        Assertions.assertEquals(15.2, result);
    }

    @Test
    public void givenStringValueMaxAtFirstPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        String result = maximumNo.DisplayStringMaximumNo("Peach", "Apple", "Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenStringValueMaxAtSecondPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        String result = maximumNo.DisplayStringMaximumNo("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenStringValueMaxAtThirdPosition() {
        FindMaximumNumber maximumNo = new FindMaximumNumber();
        String result = maximumNo.DisplayStringMaximumNo("Apple", "Banana", "Peach");
        Assertions.assertEquals("Peach", result);
    }
}
