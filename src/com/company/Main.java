package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many sides are on your dice");
        int sidesAmount = input.nextInt();
        System.out.println("How many times do you want to throw the dice");
        int throwAmount = input.nextInt();
        int[] tally = new int[sidesAmount + 1];

        for (int i = 0; i < throwAmount; i++) {
            int newRandom = random.nextInt(sidesAmount) + 1;
           // System.out.println(newRandom);
            tally[newRandom]++;


        }
        for (int i = 1; i < sidesAmount; i++) {
            System.out.println("Your dice landed on side " + i + " " + tally[i] + " times!");
        }



    }
}
