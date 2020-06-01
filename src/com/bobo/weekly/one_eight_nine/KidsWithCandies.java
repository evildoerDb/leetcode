package com.bobo.weekly.one_eight_nine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boild
 * @date 2020-06-01
 */
public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
