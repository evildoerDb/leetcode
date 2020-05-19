package com.bobo.refers_to_offer;

/**
 * @author Boild
 * @date 2020-05-19
 */
public class Multiply {

    /**
     * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
     * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
     *
     * @param A
     * @return
     */
    public static int[] multiply(int[] A) {
        int[] res = new int[A.length];

        //res[i] 存储的是左边所有数的乘积
        int k = 1;
        for (int i = 0; i < A.length; i++) {
            res[i] = k;
            k *= A[i];
        }

        //此次遍历是将左边乘积乘以右边的乘积
        k = 1;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] *= k;
            k *= A[i];

        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] temp = multiply(arr);
        for (int i : temp) {
            System.out.println(i);

        }
    }
}
