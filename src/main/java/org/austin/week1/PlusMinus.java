package org.austin.week1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with 6 places after the decimal.
 */

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        List<Integer> ans = new ArrayList<>(Collections.nCopies(3,0));

        for (Integer a : arr) {
            if (a>0) {
                ans.set(0,ans.get(0)+1);
            } else if (a<0) {
                ans.set(1,ans.get(1)+1);
            } else {
                ans.set(2,ans.get(2)+1);
            }
        }

        System.out.printf("%f\n%f\n%f\n",
                (float)(ans.get(0))/arr.size(),
                (float)(ans.get(1))/arr.size(),
                (float)(ans.get(2))/arr.size());

    }
}
