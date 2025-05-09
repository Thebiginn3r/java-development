package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkin_RoomChange_OccupiedAndDirty(){
        //arrange
        Room newRoom = new Room(true,false);
        boolean occupiedIs = false;
        boolean dirtyIs = false;
        boolean expectedBoolean = true;

        //Act
        newRoom.ischeckIn(occupiedIs);

        //Assert
        boolean actualAnswer = newRoom.getPrice();
        assertEquals(expectedBoolean,actualAnswer);
    }

}