package com.bobo.refers_to_offer;

/**
 * @author Boild
 * @date 2020-05-19
 */
public class JumpFloorII {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     *
     *
     * 1级有1种方法 2级有2种 3级有 f(2)+f(1)+1=4 4级有f(3)+f(2)+f(1)+1=8
     * 这个可以用数学来解释 F(n) = F（n-1）+F(n-2)+...+F(1)+1 F(n-1) = F（n-2）+F(n-3)+...+F(1)+1
     * 两个式子相减，很容易得出F(n)=2F(n-1)
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        }
        return 2 * JumpFloorII(target - 1);
    }
}
