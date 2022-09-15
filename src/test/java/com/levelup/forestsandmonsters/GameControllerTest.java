package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class GameControllerTest {
    @Test
    public void InitializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void test_default_character_is_not_null() {
        GameController testObj = new GameController();
        assertNotNull(testObj.getCharacter());
    }

    @Test
    public void test_default_character_name_is_not_null() {
        GameController testObj = new GameController();
        assertNotNull(testObj.getCharacter().getName());
    }

    @Test
    public void test_create_custom_character_with_name() {
        GameController testObj = new GameController();
        testObj.getCharacter().setName("Mario");
        String name = testObj.getCharacter().getName();
        assertEquals(name, "Mario");
    }

    @Test
    public void test_create_custom_character_with_name_scenario_2() {
        GameController testObj = new GameController();
        testObj.createCharacter("Mario");
        assertEquals(testObj.getCharacter().getName(), "Mario");
    }

    @Test
    public void test_create_custom_character_with_name_scenario_3() {
        GameController testObj = new GameController();
        testObj.createCharacter("");
        assertEquals(testObj.getCharacter().getName(), GameController.DEFAULT_CHARACTER_NAME);
    }

    @Test
    public void test_game_start_initializes_map() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertNotNull(testObj.getMap());
    }

    @Test
    public void test_game_start_initializes_map_with_x_axis_length() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertTrue(testObj.getMap().getXLength() > 0);

    }

    @Test
    public void test_game_start_initializes_map_with_y_axis_length() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertTrue(testObj.getMap().getYLength() > 0);

    }

    @Test
    public void test_game_start_initializes_map_with_x_start_coordinate() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertTrue(testObj.getMap().getXStart() > 0);

    }

    @Test
    public void test_game_start_initializes_map_with_y_start_coordinate() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertTrue(testObj.getMap().getYStart() > 0);
    }

    @Test
    public void test_game_start_has_current_x_position() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertTrue(testObj.status.currentPosition.x == GameMap.xStart);
    }

    @Test
    public void test_game_start_has_current_y_position() {
        GameController testObj = new GameController();
        testObj.startGame();
        assertTrue(testObj.status.currentPosition.y == GameMap.yStart);
    }

    @Test
    public void test_game_character_has_current_position() {
        GameController testObj = new GameController();
        testObj.startGame();
        testObj.createCharacter("");
        assertTrue(testObj.getStatus().getCurrentPosition().getX() == testObj.getCharacter().getCurrentPosition().getX());

    }

    @Test
    public void test_end_game(){
        GameController testObj = new GameController();
        testObj.startGame();
        testObj.createCharacter("Diago");
        System.out.println(testObj.getStatus());
    }






}
