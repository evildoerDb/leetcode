package com.bobo.easy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 17:43
 *
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 */
public class UniqueMorseRepresentations {

    /**
     * 自己写的
     * @param words
     * @return
     */
    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        HashMap<String,String> map = new HashMap<>();
        String[] str ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        //组装map
        for (int i = 0 ; i< str.length; i++){
            int index = i +97;
            map.put((char)index+"",str[i]);
        }

        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < word.length(); i++){
                String s = word.charAt(i)+"";
               sb.append(map.get(s));
            }
            set.add(sb.toString());
        }

        return set.size();
    }

    /**
     * 最优解 亮点在于str[word.charAt(i) - 'a']
     * @param words
     * @return
     */
    public static int uniqueMorseRepresentations2(String[] words){
        HashSet<String> set = new HashSet<>();
        String[] str ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < word.length(); i++){
                sb.append(str[word.charAt(i) - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
    public static void main(String[] args) {
       String[] words = {"gin", "zen", "gig", "msg"};
       int times = uniqueMorseRepresentations2(words);
        System.out.println(times);


    }
}
