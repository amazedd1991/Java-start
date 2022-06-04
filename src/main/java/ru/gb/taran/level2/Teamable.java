package ru.gb.taran.level2;

public interface Teamable {
    boolean isAbleToPlay();
    void jump(Wall wall);
    void run(Track track);
}
