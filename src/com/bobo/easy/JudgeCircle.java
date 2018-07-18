package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/18 15:41
 *
 * 判断是否成圈
 * 初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，
 * 判断这个机器人的移动路线是否形成一个圆圈，换言之就是判断它是否会移回到原来的位置。
 *
 * 移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。
 * 机器人有效的动作有 R（右），L（左），U（上）和 D（下）。输出应为 true 或 false，表示机器人移动路线是否成圈。
 */
public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        int up = 0 ;
        int right = 0;
        for(int i = 0 ; i < moves.length();i++){
            if(moves.charAt(i)=='U')
                up++;
            else if(moves.charAt(i)=='D')
                up--;
            else if(moves.charAt(i)=='R')
                right++;
            else if(moves.charAt(i)=='L')
                right--;
        }
        return up==0 && right==0;
    }
}
