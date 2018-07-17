package com.bobo.easy;

import java.util.HashMap;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 16:56
 *
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * j 中的每个元素在S中总共出现了多少次
 */
public class NumJewelsInStones {

    /**
     * 暴力解法
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
        int times = 0;
        for (int i = 0 ; i < J.length() ; i++){
            for (int j = 0 ; j <S.length(); j++ ){
                if (J.charAt(i) == S.charAt(j)){
                    times++;
                }
            }
        }
        return times;
    }

    /**
     * 使用HashMap  时间复杂度低了 但是空间复杂度高了
     * 还有一种利用桶的思想进行。大概步骤就是  初始化一个256大小的int数组 先对J进行遍历  J的字符的ASCII码表对应的位置加一
     * 然后对S进行遍历  S中的字符对应的数组位置有值得话  times就加一
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones2(String J, String S){
        int times = 0 ;
        HashMap<Character,Character> map = new HashMap();

        //组装成HashMap
        for(int i = 0 ; i < J.length(); i++){
            map.put(J.charAt(i),J.charAt(i));
        }
        for(int i = 0; i < S.length(); i++){
            if (map.containsKey(S.charAt(i))){
                times++;
            }
        }

        return times;
    }



    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        //TODO
        //待改进 此解法只是暴力解法
        int times = numJewelsInStones2(J,S);
        System.out.println(times);
    }
}
