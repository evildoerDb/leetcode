package com.bobo.hard;

/**
 * Created by evildoerDb on 2018/8/1 15:49
 */
public class StackTest {

    public static void main(String[] args) {
        recure(9,0);
    }

    public static void recure(int deep,int index){
        if (deep < 10 ){
            index++;
            System.out.println("第"+index+"次递归");
            recure(--deep,index);
        }
    }
}
