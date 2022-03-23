package Lesson6;


public class Zoo {
    public static void main(String[] args) {


        Animal cat = new Cat("Barsik");
        cat.Run(333);
        cat.Swim(1);
        System.out.println();

        Animal dog = new Dog("Reks");
        dog.Run(600);
        dog.Swim(15);
        System.out.println();

        Animal horse =new Animal("Mustang");
        horse.Run(1000);
        horse.Swim(200);
        System.out.println();

        Animal horse2 =new Animal("Mike");
        horse.Run(5000);
        horse.Swim(300);
        System.out.println();


        System.out.println("Всего животных : "+ Animal.getCount());








    }
}
