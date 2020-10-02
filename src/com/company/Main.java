package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        boolean end = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of player 1: ");
        String player1 = scan.nextLine();

        System.out.println("Enter the name of player 2: ");
        String player2 = scan.nextLine();

        //Vi laver en while loop, fordi vi vil gerne kaster terningerne indtil en af spillerne vinder
        //Det betyder her, at while loop kommer til at køre indtil boolen end bliver til false
        System.out.println("Rolling the dice, waiting for the winner...");
        while (end) {

        //Her har vi lavet to integers, som er 0 til at stare med, men som kommer til at fylde mere
            int playerOne = 0;
            int playerTwo = 0;

            //Her tillader vi at kaste terningerne max 20 gange, det er rimelig for at få resultat og tag en vinder
            for (int i = 0; i < 20; i++) {

                //Her kaster man en terning og tilføjer resultatet til player 1 indtil han rammer 40 eller ovre
                playerOne += castDice();
                playerOne += castDice();

                //Her sker det samme, bare med en anden player
                playerTwo += castDice();
                playerTwo += castDice();

                //De her to sysout er lavet for at se hvor langt hver player er
                System.out.println(player1 + "'s result is: " + playerOne);
                System.out.println(player2 + "'s result is: " + playerTwo);



                //I dette her if/else statement siger vi, at spilleren der rammer tallet 40 først - vinder
                //Det gør man ved at stoppe både while og for loops, hvis den ene af spiller rammer 40
                if (playerOne >= 40) {
                    System.out.println(player1 + " won with score: " + playerOne);

                    //Her siger vi, at end er falsk, så while loop er ikke længere gyldyg og den stopper
                    end = false;

                    //Her stopper vi vores for loop, uanset om man har kastet tærning 20 gange, fordi resultatet 40 er opnået
                    //og det giver ikke mening til at køre den videre
                    break;
                } else if (playerTwo >= 40) {
                    System.out.println(player2 + " won with score: " + playerTwo);
                    end = false;
                    break;
                }


            }

        }

    }

    //Denne metode returnerer et tilfældig nummmer fra 1 til 6
    public static int castDice(){
        int min = 1;
        int max = 6;
        int range = max - min + 1;

        return (int)(Math.random() * range) + min;
    }

}
