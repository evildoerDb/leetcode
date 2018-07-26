package com.bobo.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/7/26 14:35
 *
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * Example:
 *
 * n = 15,
 *
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 *
 * 412
 */
public class FizzBuzz {

    /**
     * 一般解法
     * @param n
     * @return
     */
    public static List<String> fizzBuzz(int n) {
        List<String> stringList = new ArrayList<>();

        for (int i = 1 ;i <= n ; i++){
            if (i % 3 ==0 && i % 5 ==0 ){
                stringList.add("FizzBuzz");
            }else if (i % 3 ==0 && i % 5 !=0 ){
                stringList.add("Fizz");
            }else if (i % 3 !=0 && i % 5 ==0){
                stringList.add("Buzz");
            }else {
                stringList.add(i+"");
            }
        }

        return stringList;
    }

    /**
     *
     * @param n
     * @return
     */
    public static List<String> fizzBuzz2(int n) {
        List<String> stringList = new ArrayList<>();

        for (int i = 1 ;i <= n ; i++){
            if (i %15 ==0 ){
                stringList.add("FizzBuzz");
            }else if (i % 3 ==0 ){
                stringList.add("Fizz");
            }else if (i % 5 ==0){
                stringList.add("Buzz");
            }else {
                stringList.add(i+"");
            }
        }

        return stringList;
    }

    public static void main(String[] args) {

        List<String> stringList = fizzBuzz(15);
        for (String str : stringList){
            System.out.println(str);
        }
    }
}
