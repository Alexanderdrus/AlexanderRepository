package Lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;

    }
    public void info() {
        System.out.println("В миске : " + food+ " еды" );
    }
    public void addFood(int x) {
        food += x;
        System.out.println("В миску добавили " + x + " еды" );

    }

    public int getFood() {
        return food;
    }
}
