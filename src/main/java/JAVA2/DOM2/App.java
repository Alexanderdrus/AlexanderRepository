package JAVA2.DOM2;

public class App {
    public static void main(String[] args) {
        String[][] arr1={{"1","2","3","4"}, {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};//Верный массив
        String[][] arr2={{"1","1","1","1"}, {"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};//Верный массив
        String[][] arr3={{"один","ld","1","1"}, {"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};//Неверные данные массив
        String[][] arr4={{"1","1","1",}, {"1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};//Неверный размер массива
        // 1 Массив
        try {

            try {
                System.out.println("Cумма элементов массива = " + metodsum(arr1));
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        }
        catch (MyArrayDataException e){
            System.out.println("Неправильное значение массива в ячейке: "+ e.i +"x"+ e.j );
        }
        // 2 Массив
        try {

            try {
                System.out.println("Cумма элементов массива = " + metodsum(arr2));
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        }
        catch (MyArrayDataException e){
            System.out.println("Неправильное значение массива в ячейке: "+ e.i +"x"+ e.j );
        }
        // 3 Массив
        try {

            try {
                System.out.println("Cумма элементов массива = " + metodsum(arr3));
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        }
        catch (MyArrayDataException e){
            System.out.println("Неправильное значение массива в ячейке: "+ e.i +"x"+ e.j );
        }
        //  4 Массив
        try {

            try {
                System.out.println("Cумма элементов массива = " + metodsum(arr4));
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        }
        catch (MyArrayDataException e){
            System.out.println("Неправильное значение массива в ячейке: "+ e.i +"x"+ e.j );
        }
    }
    public static int metodsum(String[][] arr1) throws MyArraySizeException, MyArrayDataException {
        int sum=0;
        if(arr1.length!=4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length !=4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr1.length; j++) {
                try {sum=sum+Integer.parseInt(arr1[i][j]);
            }
            catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j);
            }
            }
        }
        return sum;
    }

}
