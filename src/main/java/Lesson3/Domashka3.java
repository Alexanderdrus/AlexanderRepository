package Lesson3;

import java.util.Arrays;

public class Domashka3 {
    public static void inversArr (String[] args) {
        int[] arr = { 1, 0, 1, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr[i]=1;
            }
            else {
               arr[i]=0;
            }
        }
        System.out.print(Arrays.toString(arr));
    }



}
