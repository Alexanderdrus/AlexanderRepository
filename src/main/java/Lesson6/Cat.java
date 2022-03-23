package Lesson6;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }
    //Кот бежит максимум 200 м
    void Run (int a){
        if (a>200){System.out.println(name + " пробежал "+ 200 + "м");
        }
        else {System.out.println(name + " пробежал "+ a + "м");
        }
    }
    //Коты не плавают

    void Swim (int b){
        System.out.println(name  + " не плавает");
    }


}
