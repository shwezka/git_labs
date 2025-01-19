package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Oh hello there");
        System.out.println("General Kenobi!");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("You said: " + s);
    }
}