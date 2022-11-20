package org.austin.week1;

import java.util.List;
import java.math.BigInteger;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */

public class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        BigInteger minVal = BigInteger.valueOf(Long.MAX_VALUE), maxVal = BigInteger.ZERO, sum = BigInteger.ZERO;

        //Sum all the elements
        for (Integer a : arr) {
            sum = sum.add(BigInteger.valueOf(a));
        }

        for (Integer elem : arr) {
            //Update the minimum sum by subtracting the current elem from the total sum and comparing
            minVal = minVal.min(sum.subtract(BigInteger.valueOf(elem)));

            //Update the maximum sum by subtracting the current elem from the total sum and comparing
            maxVal = maxVal.max(sum.subtract(BigInteger.valueOf(elem)));
        }

        System.out.printf("%d %d\n", minVal, maxVal);

    }
}
