package com.bobo.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boild
 * @date 2020-03-10
 */
public class GenerateParenthesis {

    static List<String> list = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {

        dfs(n, n, "");
        return list;
    }

    private static void dfs(int left, int right, String pre) {
        if (left == 0 && right == 0) {
            list.add(pre);
            return;
        }
        if (left > 0){
            dfs(left - 1, right, pre + "(");
        }

        if (left != right){
            dfs(left, right - 1, pre + ")");
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
