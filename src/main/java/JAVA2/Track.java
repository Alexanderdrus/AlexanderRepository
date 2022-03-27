package JAVA2;

public class Track implements Obtacle {

    private Integer lenght;

    public Track(Integer lenght) {
        this.lenght = lenght;
    }

    public Integer getLenght() {
        return lenght;
    }

    @Override
    public void overcome(Playable player) {
        player.run(this);

    }
}
