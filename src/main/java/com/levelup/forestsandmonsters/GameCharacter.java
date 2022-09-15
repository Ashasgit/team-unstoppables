package com.levelup.forestsandmonsters;
import java.awt.Point;

public class GameCharacter {

    private Point currentPosition;
    private String name;

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
