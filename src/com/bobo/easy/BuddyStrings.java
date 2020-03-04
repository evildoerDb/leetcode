package com.bobo.easy;

/**
 * @author Boild
 * @date 2020-03-04
 */
public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {

            /**
             * 两个字符串相同的时候
             * 只要有元素出现两次就可以交换
             */
            int[] arr = new int[26];
            for (int i = 0; i < A.length(); i++) {
                arr[A.charAt(i) - 'a']++;
            }

            for (int i : arr) {
                if (i > 1) {
                    return true;
                }
            }
            return false;
        } else {

            /**
             * 只有两处不一样的时候才成立
             */
            int first = -1;
            int second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            return (second != -1 && A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first));
        }
    }

    public boolean buddyStrings2(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            int[] count = new int[26];
            for (int i = 0; i < A.length(); ++i)
                count[A.charAt(i) - 'a']++;

            for (int c: count)
                if (c > 1) return true;
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && A.charAt(first) == B.charAt(second) &&
                    A.charAt(second) == B.charAt(first));
        }

    }
}
