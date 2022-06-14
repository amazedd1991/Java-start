package ru.gb.taran.level2;

public class Track implements Obstacle {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Teamable teamable) {
        teamable.run(this);
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Длина беговой дорожки " + length + " метров.";
    }
}
