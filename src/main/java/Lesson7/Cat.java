package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);

    }
    public void changeSatiety() {
        satiety=true;
    }

    public void infocat () {
        System.out.println("Кот " + name+  " накормлен " + satiety);
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
}
