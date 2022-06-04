package ru.gb.taran.level2;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Teamable teamable) {
        teamable.jump(this);
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Высота стены " + height + " метров.";
    }
}
