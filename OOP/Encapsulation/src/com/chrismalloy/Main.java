package com.chrismalloy;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "Chris";
//	    player.health = 20;
//	    player.weapon = "Mage Staff";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining() + ".");
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining() + ".");

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Chris", 100, "Mage Staff");
        System.out.println("Initial health is " + enhancedPlayer.getHealth() + ".");

    }
}
