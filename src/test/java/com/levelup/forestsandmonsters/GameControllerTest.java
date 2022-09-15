package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
