package Java3;

import java.util.ArrayList;


public class Box <T extends Fruit> {
    private ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public double getWeight(){
        double weight =0.0d;
        for (T t : list) {
            weight += t.getWeight();
        }
        return weight;
    }
    public void pour (Box<T> another ) throws BoxException {
        if (FruitInBoxComparable(another)) {
            throw new BoxException("Нельзя смешивать разные типы фруктов в одной коробке");
        }
        another.list.addAll(list);
        list.clear();
    }

    public boolean compare(Box<?> t){
        return Math.abs(this.getWeight()-t.getWeight()) < 0.00001;
    }
    public void add(T fruit){
        if(this.list.size()>1){
            if(FruitComparable(fruit)){
                throw new BoxException("Нельзя смешивать разные типы фруктов в одной коробке");
            }
        }
        this.list.add(fruit);

    }
    public boolean FruitInBoxComparable(Box another) {
        return this.list.get(0).getClass() != another.list.get(0).getClass();
    }

    public boolean FruitComparable(Fruit fruit) {
        return this.list.get(0).getClass() != fruit.getClass();

    }
}


