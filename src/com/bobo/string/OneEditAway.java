package com.bobo.string;

/**
 * @author Boild
 * @date 2020-05-23
 */
public class OneEditAway {

    /**
     * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
     * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
     * @param first
     * @param second
     * @return
     */
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        return true;
    }
}
