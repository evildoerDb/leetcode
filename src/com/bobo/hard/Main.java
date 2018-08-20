package com.bobo.hard;

import java.util.Scanner;

/**
 * Created by evildoerDb on 2018/8/17 17:59
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(a+(b * c),a * (b +c));
        max = Math.max(max,a * b * c);
        max = Math.max(max,(a + b) * c);
        System.out.println(max);
    }
}
