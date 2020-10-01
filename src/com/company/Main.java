package com.company;

public class Main {

    public static void main(String[] args)
    {

        boolean end = true;

        //Vi laver en while loop, fordi vi vil gerne kaster terningerne indtil en af spillerne vinder
        //Det betyder her, at while loop kommer til at køre indtil boolen end bliver til false
        while (end) {

//Her har vi lavet to integers, som er 0 til at stare med, men som kommer til at fylde mere
            int playerOne = 0;
            int playerTwo = 0;

            //Her tillader vi at kaste terningerne max 20 gange, det er rimelig for at få resultat og tag en vinder
            for (int i = 0; i < 20; i++) {




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
