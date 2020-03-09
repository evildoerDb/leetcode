package com.bobo.medium;

/**
 * @author Boild
 * @date 2020-03-09
 */
public class LongestMountain {

    /**
     * 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
     *
     * B.length >= 3
     * 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
     * （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
     *
     * 给出一个整数数组 A，返回最长 “山脉” 的长度。
     *
     * 如果不含有 “山脉” 则返回 0。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-mountain-in-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param A
     * @return
     */
    public static int longestMountain(int[] mountain) {

        if (mountain.length < 3) {
            return 0;
        }

        int max = 0;

        for (int i = 1; i < mountain.length - 1; i++) {

            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                while (left > 0 && mountain[left - 1] < mountain[left]) {
                    left--;
                }

                while (right < mountain.length -1 && mountain[right] > mountain[right + 1]) {
                    right++;
                }
                max = Math.max(max, right - left + 1);
            }

        }



        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,4,7,3,2,5};

        System.out.println(longestMountain(arr));
    }
}

