package JAVA2;

public class Cat implements Playable {
    private String name;
    private Integer runLimit;
    private Integer jumpLimit;
    private boolean play;

    public Cat(String name,Integer runLimit, Integer jumpLimit,boolean play) {
        this.name=name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play = play;

    }

    @Override
    public void run(Track track) {
        if (runLimit < track.getLenght() ) {
            System.out.println(name + " не смог пробежать ");
            play = false;
        }
        else{System.out.println(name + " пробежал ");
            play = true;
        }


    }

    @Override
    public void jump(Barrier barrier) {
        if (play==false){
            System.out.println(name + " В прыжках не участвует");

        }
        else {
            if (jumpLimit < barrier.getHeight() ) {
            System.out.println(name + " не смог перепрыгнуть ");
            play = false;
        }
        else {System.out.println(name + " перепрыгнул ");
            play = true;}
        }


    }
}
