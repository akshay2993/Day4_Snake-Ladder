package com.bridgelabz.JavaPP_Day4;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int playerPosition = 0;
        int endPosition = 100;
        int dieRollCount = 0;
        while(playerPosition != endPosition){
            int dieRoll = (int) Math.floor(Math.random() * 6) + 1;
            dieRollCount ++;
            System.out.println("Die Roll: "+ dieRoll);
            int option = (int) Math.floor(Math.random() * 3) + 1;
            switch (option) {
                case 1:
                    System.out.println("No Play! Stay.");
                    break;
                case 2:
                    System.out.println("Ladder! Go Ahead.");
                    playerPosition += dieRoll;
                    break;
                case 3:
                    System.out.println("Snake! Move Back.");
                    playerPosition -= dieRoll;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }
            if(playerPosition > 100) {
              playerPosition -= dieRoll;
            }
            System.out.println("Player position: "+playerPosition);
        }
        System.out.println("No. of times die was rolled:"+dieRollCount);
    }

}
