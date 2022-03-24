package JAVA2;

public class App {

    public static void main(String[] args) {
        Playable[] players = new Playable[]{
                new Robot("Bobot",250,50,true),
                new Robot("Chobot",220,12,true),
                new Cat("Barsik",110,20,true),
                new Cat("Murzik",140,22,true),
                new Human("Mike",180,20,true),
                new Human("Igor",170,30,true)

        };
        Obtacle[] obtacles ={
                new Track(150),
                new Barrier(21)
        };
        for (Obtacle obtacle : obtacles) {
            for (Playable player : players) {
                obtacle.overcome(player);
            }
            
        }


    }




}
