package Exercise01;
/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Evan Verdu
 */

import  java.util.Scanner;

public class Exercise01 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");

    }

}
