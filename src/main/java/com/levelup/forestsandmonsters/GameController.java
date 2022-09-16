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
        character.setCurrentPosition(coordinates);

        System.out.println("Character Position: " +  character.getCurrentPosition());

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

        System.out.println("Moving to " + directionToMove + "");
        Point currentPosition = getCharacter().getCurrentPosition();
        int x=currentPosition.x;
        int y=currentPosition.y;
            
        switch(directionToMove) {
            
            case EAST:
                x=currentPosition.x+1;
                break;
            case WEST:
                x=currentPosition.x-1;
                break;
            case NORTH:
                y=currentPosition.y+1;
                break;
            case SOUTH:
                y=currentPosition.y-1;
                break;
        }

        if(map.isValidPostion(x,y)) {
            currentPosition.setLocation(x,y);
        }

        System.out.println("Moved "+ directionToMove + "To:" + currentPosition);
        status.setCurrentPosition(currentPosition);

    }



}
