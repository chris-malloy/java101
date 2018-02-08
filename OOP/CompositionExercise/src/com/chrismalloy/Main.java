package com.chrismalloy;

public class Main {

    public static void main(String[] args) {
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.
        Floor theFloor = new Floor(20,10,"wooden", "brown");
        Door theDoor = new Door(8, 3, "solid", "white");
        Seat theSeat = new Seat(2, "couch", "black");
        Table theTable = new Table(2, 3, 1, "wooden", "green");
        Room livingRoom = new Room(theFloor, theDoor, theSeat, theTable);

        livingRoom.getSqft();
        livingRoom.freeSeats();
    }
}
