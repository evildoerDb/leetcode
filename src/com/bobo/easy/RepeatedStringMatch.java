package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/17 16:59
 *
 *
 *Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
 *
 * For example, with A = "abcd" and B = "cdabcdab".
 *
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
 *
 * Note:
 * The length of A and B will be between 1 and 10000.
 *
 * 686
 */
public class RepeatedStringMatch {

    /**
     * 暴力解法
      * @param A
     * @param B
     * @return
     */
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (sb.length() < B.length() + A.length()){
            sb.append(A);
            count++;
        }
        if (sb.toString().lastIndexOf(B) != -1){
            return count;
        }


        return -1;
    }
}
