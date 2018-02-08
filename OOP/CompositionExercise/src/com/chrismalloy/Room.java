package com.chrismalloy;

public class Room {
    private Floor floor;
    private Door door;
    private Seat seat;
    private Table table;

    public Room(Floor floor, Door door, Seat seat, Table table) {
        this.floor = floor;
        this.door = door;
        this.seat = seat;
        this.table = table;
    }

    public void getSqft(){
        int sqft = floor.calcSqft();
        System.out.println("The room is " + sqft + " square feet.");
    }

    public void freeSeats(){
        System.out.println("There are " + seat.getSeats() + " free seats.");
    }
}
