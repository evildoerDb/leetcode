package com.bobo.hard;

import com.bobo.utils.ArrayUtils;

import java.util.Stack;

/**
 * Created by evildoerDb on 2018/8/6 15:44
 *
 * 最大矩形面积
 *
 * 84
 */
public class LargestRectangleArea {

    /**
     * 暴力解法  O(n ^ 2)
     * @param heights
     * @return  376 ms
     */
    public static int largestRectangleArea(int[] heights) {

        if (heights.length == 0){
            return 0;
        }
        if (heights.length ==1){
            return heights[0];
        }

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int left = i;
            int right = i;
            while (left >= 0 && heights[left] >= heights[i]){
                left--;
            }
            while (right < heights.length && heights[right] >= heights[i]){
                right++;
            }
            maxArea = Math.max(heights[i],Math.max(maxArea, heights[i] * ((right - left -1))));
        }

        return maxArea;
    }

    /**
     * 单调栈解法
     * @param heights
     * @return  29 ms
     */
    public static int largestRectangleArea1(int[] heights){

        if (heights.length == 0){
            return 0;
        }
        if (heights.length ==1) {
            return heights[0];
        }

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i <= heights.length; i++){
            int value = (i == heights.length ? -1 : heights[i]);
            if(stack.isEmpty() || value >= heights[stack.peek()]){
                stack.push(i);
            }else{
                int index = stack.pop();
                maxArea = Math.max(maxArea, heights[index] * (stack.isEmpty() ? i : i - stack.peek() - 1 ));
                i--;
            }
        }

        return maxArea;
    }


    /**
     * 时间最快的解法
     * @param height
     * @return  2 ms
     */
    public static int largestRectangleArea2(int [] height){
        if (height == null || height.length == 0) {
            return 0;
        }
        // idx of the first bar the left that is lower than current
        int[] lessFromLeft = new int[height.length];
        // idx of the first bar the right that is lower than current
        int[] lessFromRight = new int[height.length];
        lessFromRight[height.length - 1] = height.length;
        lessFromLeft[0] = -1;

        for (int i = 1; i < height.length; i++) {
            int p = i - 1;

            while (p >= 0 && height[p] >= height[i]) {
                p = lessFromLeft[p];
            }
            lessFromLeft[i] = p;
        }

        for (int i = height.length - 2; i >= 0; i--) {
            int p = i + 1;

            while (p < height.length && height[p] >= height[i]) {
                p = lessFromRight[p];
            }
            lessFromRight[i] = p;
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
        }

        return maxArea;
    }


    public static void main(String[] args) {
        int [] arr = ArrayUtils.getArray(100000000,100000);
        long begin = System.currentTimeMillis();
        largestRectangleArea(arr);
        long end = System.currentTimeMillis();

        System.out.println("暴力解法总共用了 ： " +(end - begin)+ "毫秒");

        long begin1 = System.currentTimeMillis();
        largestRectangleArea1(arr);
        long end1 = System.currentTimeMillis();
        System.out.println("单调栈解法总共用了： " +(end1 - begin1) +"  毫秒");
    }
}
