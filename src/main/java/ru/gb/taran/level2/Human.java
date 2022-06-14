package ru.gb.taran.level2;

public class Human implements Teamable {

    private String name;
    private int jumpLimit;
    private int runLimit;
    private boolean play;

    public Human(String name, int jumpLimit, int runLimit) {
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.play = true;
    }

    @Override
    public boolean isAbleToPlay() {
        return true;
    }

    @Override
    public void jump(Wall wall) {
        if (isAbleToPlay()) {
            if (jumpLimit >= wall.getHeight()) {
                System.out.println(this + " перепрыгнул через препятствие " + wall);
            } else
                System.out.println(this + " не смог перепрыгнуть препятствие" + wall);
        }
    }

    @Override
    public void run(Track track) {
        if (isAbleToPlay()) {
            if (runLimit >= track.getLength()) {
                System.out.println(this + " пробежал " + track);
            } else
                System.out.println(this + " не смог пробежать " + track);
        }
    }

    @Override
    public String toString() {
        return "Человек " + name;
    }
}
