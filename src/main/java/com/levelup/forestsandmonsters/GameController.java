package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_CHARACTER_NAME = "Character";
    private GameCharacter character = null;
    private GameMap map= null;

    public GameMap getMap() {
        return map;
    }

    public void setMap(GameMap map) {
        this.map = map;
    }

    public GameCharacter getCharacter() {
        return character;
    }

    public void setCharacter(GameCharacter character) {
        this.character = character;
    }

    public class GameStatus {
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        public void setCurrentPosition(Point currentPosition) {
            this.currentPosition = currentPosition;
        }
        public Point getCurrentPosition() {
            return currentPosition;
        }
        @Override
        public String toString() {
            return "Character Name:" + characterName + "\nEnd Position:" + currentPosition.x + "," + currentPosition.y;
        }
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
        character = new GameCharacter();
        character.setName(DEFAULT_CHARACTER_NAME);
    }

    public void setCharacterPosition(Point coordinates){ 
 // TODO: IMPLEMENT THIS 

    }
    // CLI commands matches domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    public void createCharacter(String name) {
        
        if (name != null && !name.equals("")) {
            status.characterName = name;
            getCharacter().setName(name);
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }

    }

    public void startGame() {
        map = new GameMap();
        getStatus().setCurrentPosition(new Point(map.getXStart(), map.getYStart()));
        getCharacter().setCurrentPosition(new Point(GameMap.xStart, GameMap.yStart));

    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void endGame() {
        System.out.println(status);

    }
    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
    }

}
