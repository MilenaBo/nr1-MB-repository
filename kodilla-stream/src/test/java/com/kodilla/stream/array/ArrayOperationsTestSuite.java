package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite  {
    @Test
    public void testGetAverage() {
// given
        int[] names = new int[10];
        names[0] = 5;
        names[1] = 5;
        names[2] = 3;
        names[3] = 2;
        names[4] = 200;
        names[5] = 5;
        names[6] = 5;
        names[7] = 3;
        names[8] = 2;
        names[9] = 22;

// when
        ArrayOperations.getAverage(names);

// then

        Assert.assertEquals(25.2, ArrayOperations.getAverage(names));
    }
}
