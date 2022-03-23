package Lesson7;

public class App {
    public static void main(String[] args) {
        Cat[] cats=new Cat[4];
        cats[0] = new Cat("Барсик", 101, false);
        cats[1] = new Cat("Майк", 11, false);
        cats[2] = new Cat("Рыжик", 13, false);
        cats[3] = new Cat("Вискас", 14, false);
        Plate plate = new Plate(100);

        plate.info();
        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety()==false && cats[i].getAppetite()<plate.getFood()) {
                cats[i].eat(plate);
                cats[i].changeSatiety();
                System.out.println("Кот "+ cats[i].getName() + " поел");

            }
            else {
                System.out.println("Кот "+ cats[i].getName() + " не поел");

            }
        }
        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i].infocat();

        }
        System.out.println();
        plate.info();
        System.out.println();
        plate.addFood(300);
        System.out.println();
        plate.info();

    }
}
