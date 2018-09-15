package com.bobo.utils;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2= scanner.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0 ; i < n; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();

        }
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++){
            xMax = Math.max(xMax,arr[i][0]);
            xMin = Math.min(xMin,arr[i][0]);
            yMax = Math.max(yMax,arr[i][1]);
            yMin = Math.min(yMin,arr[i][1]);
        }



    }
}
