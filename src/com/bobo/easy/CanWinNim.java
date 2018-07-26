package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/26 14:59
 *
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 *
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
 *
 * Example:
 *
 * Input: 4
 * Output: false
 * Explanation: If there are 4 stones in the heap, then you will never win the game;
 *              No matter 1, 2, or 3 stones you remove, the last stone will always be
 *              removed by your friend.
 *
 *
 */
public class CanWinNim {

    /**
     *
     * @param n
     * @return
     *
     * 假设第一个玩家（A）留下x个宝石，他可以拿走1,2,3个宝石，所以第二个玩家B将有三个案例来处理（x-1），（x-2），（x- 3）。
     * 在他挑选石头后，将有9个案例留给A.
     *
     * B (x-1) -> A: (x-2), (x-3), (x-4)
     * B (x-2) -> A: (x-3), (x-4), (x-5)
     * B (x-3) -> A: (x-4), (x-5), (x-6)
     * 现在，如果A可以保证他在三组中的任何一组中获胜，那么他可以强制B进入三个状态中的一个状态，A可以在B移动后最终进入该特定组。
     *
     * f(x) = (f(x-2)&&f(x-3)&&f(x-4)) || (f(x-3)&&f(x-4)&&f(x-5)) || (f(x-4)&&f(x-5)&&f(x-6))
     * 如果我们稍微检查一下方程式，我们可以发现f（x - 4）是一个临界点，如果f（x-4）为假，则f（x）将始终为假。
     *
     * 我们还可以找出初始条件，f（1），f（2），f（3）将为真（A总是胜利），而f（4）将为假。因此
     * 基于先前的等式和初始条件f（5）= f（6）= f（7）=真，f（8）=假;
     * 显然，f（1），f（2），f（3）可以使所有f（4n + 1），f（4n + 2），f（4n + 3）成立，只有f（4n）将是那么假。
     * 所以这里我们采用一线解决方案：
     *
     * return（n％4！= 0）;
     */
    public boolean canWinNim(int n) {
        return (n % 4) != 0;
    }
}
