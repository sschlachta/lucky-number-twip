package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner theirName = new Scanner(System.in);
        String luckName = theirName.nextLine();
        Lucky pers = new Lucky(1, luckName);
        int luckyNumber = (int)(Math.random() * 100 + 1);
        System.out.println("Hello " + luckName + "! It's nice to meet you! Your lucky number is: " + luckyNumber * luckyNumber);

    }
}
