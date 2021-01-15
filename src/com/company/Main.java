package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int LevelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score >1000) {
//            System.out.println("Your score was less than 5000 and greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }else {
//            System.out.println("You got here");
//        }
        if(gameOver == true) {
            int finalScore = score + (LevelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newgameOver = true;
        int newscore = 10000;
        int newLevelCompleted = 8;
        int newbonus = 200;
        if(newgameOver == true) {
            int SecondScore = newscore + (newLevelCompleted * newbonus);
            System.out.println("Your second score was " + SecondScore);
        }


        }
    }