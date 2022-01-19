package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Domashka4 {

    //Поле
    public static char[][] map;
    //Размер поля
    public static final int SIZE=3;

    //Точек для победы
    public static final int DOTS_TO_WIN=3;

    //Типы точек
    public static final char DOT_EMPTY='*';
    public static final char DOT_X ='X';
    public static final char DOT_O ='O';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);

    //рандом
    public static final Random RANDOM = new Random();

    /**
     * Инициализация поля игры.
     */
    public static void initMap(){
        map=new char[SIZE][SIZE];
        for (int i=0;i<map.length; i++){
            for (int j=0;j<map[i].length; j++){
                map[i][j]=DOT_EMPTY;
            }
        }
    }

    /**
     * Вывод поля на экран
     */

    public static void printMap() {
        //нумерация вехнего ряда
        for (int i = 0; i <=map.length; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //
        for (int i = 0; i < map.length; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека.
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    /**
     * Ход компьютера.
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * Проверка валидны ли значения поля
     *
     * @param x координата X
     * @param y координата Y
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    /**
     * Проверка победы.
     * @param symbol Символ для которого проверяем. Крестик или нолик
     * @return true, если выиграл
     */
    public static boolean checkWin(char symbol) {
        int stroka, stolbec,diag1,diag2;
        for (int i = 0; i < SIZE; i++) {
            stroka=0;stolbec=0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j]==symbol){
                    stroka++;
                }
                if (map[j][i]==symbol){
                    stolbec++;
                }

            }
            if (stroka==DOTS_TO_WIN||stolbec==DOTS_TO_WIN){
                return true;
            }

        }
        diag1=0;diag2=0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i]==symbol){
                diag1++;
            }
            if (map[i][SIZE-i-1]==symbol){
                diag2++;
            }
            if(diag1==DOTS_TO_WIN||diag2==DOTS_TO_WIN){
                return true;
        }

        }
        return false;

        /*Старый способ 2
        //Строки и столбцы
        for (int i = 0; i < SIZE; i++){
            if ((map[i][0] == symbol && map[i][1] == symbol &&
                    map[i][2] == symbol) ||
                    (map[0][i] == symbol && map[1][i] == symbol &&
                            map[2][i] == symbol))
                return true;}
        //диагонали
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }

        return false;
       /*Старый способ
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        //столбцы
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }
        //диагонали
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }
        return false;

        */
    }
    /**
     * Проверка что в поле не осталось ни одной ссвободной ячейки.
     * @return true, если нет ни одной свободной ячейки.
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил копьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Game over");

    }
}
