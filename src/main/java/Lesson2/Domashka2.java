package Lesson2;

public class Domashka2 {
    public static void main(String[] args) {
        checkSum(11, 32);

        checkNumber(-1);

        checkNumber2(22);

        Printstr("Джава это круто",3);

        checkYars(200);


    }
//1 Метод
    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    //2 Метод
    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    //3 Метод
    public static boolean checkNumber2 (int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    //4 Метод
    public static void Printstr(String word,int a) {
        for ( int i = 0; i < a ;i ++ ) {
            System.out.println(word);
        }
    }
    //5 Метод
    public static boolean checkYars (int yars) {
        if (yars % 4 == 0 && yars % 100 != 0 || yars % 400 == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

}