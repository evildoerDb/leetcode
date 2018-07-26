package com.bobo.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by evildoerDb on 2018/7/26 15:13
 *
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
 *
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 *
 * The rules of Goat Latin are as follows:
 *
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 *
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 *
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 *
 * 824
 */
public class ToGoatLatin {

    public static String toGoatLatin(String S) {
        StringBuilder stringBuilder = new StringBuilder();

        Set<Character> set = new HashSet<>();
        String str = "aoeiuAOEIU";
        for (int i = 0 ; i < str.length() ; i++){
            set.add(str.charAt(i));
        }
        String [] strs = S.split("\\s");
        int index = 1;
        for (String string : strs){
            if (set.contains(string.charAt(0))){
                stringBuilder.append(string);
            }else {
                stringBuilder.append(string.substring(1,string.length())).append(string.charAt(0));
            }
            stringBuilder.append("ma");
            for (int i = 0 ; i <index;i++ ){
                stringBuilder.append("a");
            }
            stringBuilder.append(" ");
            ++index;
        }


        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        String str = "I speak Goat Latin";
        str = toGoatLatin(str);
        System.out.println(str);
    }
}
