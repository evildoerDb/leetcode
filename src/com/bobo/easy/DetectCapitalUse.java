package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/8 17:40
 */
public class DetectCapitalUse {


    /**
     * 正则表达式匹配
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }

    /**
     * 正常解法
     * @param word
     * @return
     */
    public boolean detectCapitalUse1(String word){
        int num = 0;
        for (int i = 0; i < word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                num++;
            }
        }
        if (num ==1){
            return Character.isUpperCase(word.charAt(0));
        }
        return num == 0 || num == word.length();
    }
}

