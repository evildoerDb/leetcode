package com.bobo.utils;


import java.util.*;

/**
 * Created by evildoerdb_ on 2018/8/11
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String string  = getResult(n,m,k);
        System.out.println(string);


    }

    private static String getResult(int n, int m, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < n; i++){
            sb.append("a");
        }
        for (int i = 0 ; i < m; i++){
            sb.append("z");
        }
        String str = sb.toString();
        ArrayList<String> list  = getFullPermutation(str);
        List<String> finalList = trim(list);
        Collections.sort(finalList);
        if (k > finalList.size()){
            return "-1";
        }else {
            return finalList.get(k - 1);
        }


    }

    private static List<String> trim(ArrayList<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;

    }


    public static ArrayList<String> getFullPermutation(String s) {
        if (null == s || "".equals(s)){
            return null;
        }
        ArrayList<String> array = null;
        if (s.length() == 1){
            array = new ArrayList<>();
            array.add(s);
        } else {
            //递归调用
            array = getFullPermutation(s.substring(1), s.charAt(0));
        }
        return array;
    }

    public static ArrayList<String> getFullPermutation(String s, char c) {
        ArrayList<String> reArray = new ArrayList<>();
        ArrayList<String> array = getFullPermutation(s);
        for (String str : array){
            reArray.addAll(getStr(str, c));
        }
        array = null;
        return reArray;
    }
    public static ArrayList<String> getStr(String s, char c) {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            array.add(new StringBuffer().append(s.substring(0, i)).append(c).append(s.substring(i)).toString());
        }
        return array;
    }



}
