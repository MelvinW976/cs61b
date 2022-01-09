package com.MaxInt;

public class MaxInt {
    public static int max(int[] m) {
        int i = 0;
        int x = m[i];
        for(int j = 1; j <= m.length - 1; j = j + 1){

            int y = m[j];

            if(x <= y){
                x = y;
            }
            else {
                x = x;
            }
        }

        System.out.println(x);


        return 0;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);



    }
}
