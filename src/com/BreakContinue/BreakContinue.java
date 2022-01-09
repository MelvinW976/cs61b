package com.BreakContinue;

public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {

    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        int i;
        int j;
        for(i = 0; i <= a.length - 2; i = i + 1){
            if (a[i] < 0){
                continue;
            }
            for(j = 1; j <= n; j = j +1) {
                a[i] = a[i] + a[i + j];
                if(i + j >= a.length - 1){
                    break;
                }
            }
        }

        System.out.println(java.util.Arrays.toString(a));
    }
}
