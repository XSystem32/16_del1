package com.company;

public class Main {

    public static void main(String[] args)
    {

        boolean end = true;

        //Vi laver en while loop, fordi vi vil gerne kaster terningerne indtil en af spillerne vinder
        //Det betyder her, at while loop kommer til at køre indtil boolen end bliver til false
        while (end) {











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
