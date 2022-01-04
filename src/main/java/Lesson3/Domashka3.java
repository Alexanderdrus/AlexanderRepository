package Lesson3;

import java.util.Arrays;


public class Domashka3 {
    public static void main(String[] args) {
        //Задача1
        int[] arr = {1, 0, 1, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        printArray(arr);
        System.out.println();
        System.out.println();
        //Задача2
        int[] array = new int[100];
        array[array.length - 1] = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i * 1;
        }
        printArray(array);
        System.out.println();
        System.out.println();

        //Задача3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            } else {
            }
        }
        printArray(arr3);
        System.out.println();
        System.out.println();

        //Задача4
        int[][] arr4 = new int[6][6];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++){
                if (i==j||j==(arr4.length-1)-i){
                    arr4[i][j]=1;

                }
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    //Задача 5
    newarr(12,2);
        System.out.println();
        System.out.println();



    //Задача 6
        int[] arr6 = {44, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 6};
        int max =0;
        int min =arr6[1];
        for (int i = 0; i < arr6.length; i++) {
           if (arr6[i]> max) {max=arr6[i];}
           if(arr6[i]<=min){min=arr6[i];}
        }
        System.out.println("Максимальный элемент массива  "+ max);
        System.out.println("Минимальный элемент массива  "+ min);

    //Задача 7

    }

    public static void newarr (int len,int initialvalue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=initialvalue;
            System.out.print(arr[i]+" ");
        }
    }

    public static void printArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }


}