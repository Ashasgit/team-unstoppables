package com.levelup.forestsandmonsters.features;
import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.*;
public class MoveSteps {

GameController gc;
int startX, startY , endX, endY;
GameController.DIRECTION direction;
Point currentPosition;


@Given("the character starts at position with XCoordinates {int}")
public void givenTheCharacterStartsAtX(Integer startX) {
    // Write code here that turns the phrase above into concrete actions
    this.startX = startX;
}

@Given("starts at YCoordinates {int}")
public void givenTheCharacterStartsAtY(Integer startY) {
    // Write code here that turns the phrase above into concrete actions
    this.startY = startY;
}

@Given("the player choses to move in {direction}")
public void givenPlayerChoosesDirection(String direction) {
    // Write code here that turns the phrase above into concrete actions
    this.direction = GameController.DIRECTION.valueOf(direction);   
}

@When("the character moves")
public void theCharacterMoves() {
    // Write code here that turns the phrase above into concrete actions
    gc = new GameController();
    gc.setCharacterPosition(new Point(this.startX,this.startY));
    gc.move(this.direction);
    GameController.GameStatus status = gc.getStatus();
    this.currentPosition = status.currentPosition;
}

@Then("the character is now at postion with XCoordinates {int}")
public void checkXCoordinates(int endX) {
    // Write code here that turns the phrase above into concrete actions
    assertNotNull("Expected position not null",this.currentPosition.x+"");
    assertEquals(endX, this.currentPosition.x);
}

@Then("YCoordinates5")
public void checkYCoordinates(int endY) {
    // Write code here that turns the phrase above into concrete actions
    assertNotNull(endY);
    assertEquals(endY, this.currentPosition.y); 
}

@Then("YCoordinates9")
public void y_coordinates9() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
    
}
