package JAVA2;

public class Barrier implements Obtacle {

    private Integer height;

    public Barrier(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public void overcome(Playable player) {
        player.jump(this);

    }
}
