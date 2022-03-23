package Lesson6;

public class Animal {

    protected String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }
    public static int getCount() {
        return count;
    }


    void Run(int a) {
        System.out.println(name + " пробежал " + a + "м");
    }

    void Swim(int b) {
        System.out.println(name + " проплыл " + b + "м");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}