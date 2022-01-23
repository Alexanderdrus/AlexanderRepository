package Lesson6;

public class Dog extends Animal {
    public Dog (String name){
        super(name);
    }
    //Собака бежит максимум 500 м
    void Run (int a){
        if (a>500){System.out.println(name + " пробежал "+ 500 + "м");
        }
        else {System.out.println(name + " пробежал "+ a + "м");
        }
    }
    //Собака плывет максимум 10 м
    void Swim (int b){
        if (b>10){System.out.println(name + " проплыл "+ 10 + "м");
        }
        else {System.out.println(name + " проплыл "+ b + "м");
        }
    }



}
