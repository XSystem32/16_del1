package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //Denne metode returnerer et tilfældig nummmer fra 1 til 6
    public static int castDice(){
        int min = 1;
        int max = 6;
        int range = max - min + 1;

        return (int)(Math.random() * range) + min;
    }

}
