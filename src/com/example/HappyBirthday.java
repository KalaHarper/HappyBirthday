package com.example;

import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please choose a language: \n a) English \n b) Spanish");

        String selection = input.nextLine().toLowerCase(Locale.ROOT);

        if(selection.contains("a")){
            System.out.println("Happy birthday to you!\n Happy birthday to you!\n Happy birthday dear " + name + "!\n Happy birthday to you!");
        }else if(selection.contains("b")){
            System.out.println("Feliz cumpleaños a ti\n" +
                    "feliz cumpleaños a ti\n" +
                    "feliz cumpleaños " + name + "!\n" +
                    "feliz cumpleaños a ti.");
        }else{
            System.out.println("Selection invalid please try again");
        }
        //System.out.println("You chose " + selection);
    }
}
