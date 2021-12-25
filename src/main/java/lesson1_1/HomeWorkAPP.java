package lesson1_1;

public class HomeWorkAPP {
    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\n" +
                "Banana\n" +
                "Apple");

    }
    public static void checkSumSign() {
        int a = 12;
        int b = -14;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor() {
        int value = -9;
        if (value<=0) {
            System.out.println("Красный");}
        else if (value>0 && value<100) {
            System.out.println("Желтый");}
        else {
            System.out.println("Зелёный");
        }

}
    public static void compareNumbers() {
        int a =22;
        int b =44;
        if (a>=b){
            System.out.println("a>=b");}
        else {
            System.out.println("a<b");
        }
    }

    }
