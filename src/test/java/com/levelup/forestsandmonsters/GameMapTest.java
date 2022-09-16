package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class GameMapTest {

    GameMap map = new GameMap();

    @Test
    public void test_valid_move_scenario_01() {
        assertTrue(map.isValidPostion(1, 1));

    }

    @Test
    public void test_valid_move_scenario_02() {
        assertTrue(map.isValidPostion(0, 0));

    }

    @Test
    public void test_valid_move_scenario_03() {
        assertFalse(map.isValidPostion(-1, 0));

    }

    @Test
    public void test_valid_move_scenario_04() {
        assertFalse(map.isValidPostion(10, 10));

    }
    
}
