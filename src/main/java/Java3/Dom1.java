package Java3;

import java.util.ArrayList;
import java.util.Arrays;

public class Dom1 {

    public static void main(String[] args) {
        // 1 задача
        Integer arrint[]= {1,2,3,4,5,6,7};
        String arrstr[]={"abc","xe","fr","122"};
        System.out.println(Arrays.toString(arrint));
        System.out.println(Arrays.toString(arrstr));
        System.out.println();
        swap(arrint,3,6);
        swap(arrstr,1,3);
        System.out.println(Arrays.toString(arrint));
        System.out.println(Arrays.toString(arrstr));
        System.out.println();
        // 2 задача
        change(arrint);
        change(arrstr);
        // 3 задача
        Box box1= new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        Box box2= new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        Box box3= new Box();
        box3.add(new Apple());
        System.out.println("Коробка 1 весит " + box1.getWeight());
        System.out.println("Коробка 3 весит " + box3.getWeight());
        box1.pour(box3);
        System.out.println("Коробка 1 весит " + box1.getWeight());
        System.out.println("Коробка 2 весит " + box2.getWeight());
        System.out.println("Коробка 3 весит " + box3.getWeight());
        System.out.println("Сравниваем корбки 1 и 2 по весу, они " + (box1.compare(box2) ?" равны " : " не равны " ));






    }

    // Метод , который меняет два элемента массива местами.
    public static <T>  void swap (T[] array,int n1,int n2) {
        T swap = array[n1];
        array[n1]=array[n2];
        array[n2]=swap;
    }
    public static <T> void change (T[] arr){
        ArrayList<T> arrayList =new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
    }


}
