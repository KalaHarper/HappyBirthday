package com.example;

import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please choose a language: \n" +
                " a) English \n " +
                "b) Spanish \n " +
                "c) Korean \n " +
                "d) Arabic \n" +
                "e) French \n" +
                "f) Mandarin (simplified)\n" +
                "g) Bengali \n" +
                "h) Russian \n" +
                "i) Portuguese \n" +
                "j) Indonesian \n" +
                "k) \n" +
                "l) \n" +
                "m) \n" +
                "n) \n" +
                "o) \n");

        String selection = input.nextLine().toLowerCase(Locale.ROOT);

        if(selection.contains("a")){
            System.out.println("Happy birthday to you!\n Happy birthday to you!\n Happy birthday dear " + name + "!\n Happy birthday to you!");
        }else if(selection.contains("b")){
            System.out.println("Feliz cumpleaños a ti\n" +
                    "feliz cumpleaños a ti\n" +
                    "feliz cumpleaños " + name + "!\n" +
                    "feliz cumpleaños a ti.");
        }else if(selection.contains("c")){
            System.out.println("생일 축하합니다\n" +
                    "\n" +
                    "생일 축하합니다\n" +
                    "\n" +
                    "사랑하는 " + name + " 씨\n" +
                    "\n" +
                    "생일 축하합니다");

        }else if(selection.contains("d")){
            System.out.println("سنة حلوة يا جميل\n" +
                    "سنة حلوة يا جميل\n" +
                    "\n"+ name + "سنة حلوة يا " +
                    "\nسنة حلوة يا جميل");
        }else if(selection.contains("e")){
            System.out.println("Joyeux anniversaire\n" +
                    "Joyeux anniversaire\n" +
                    "Joyeux anniversaire " + name + "!\n" +
                    "Joyeux anniversaire");
        }else if(selection.contains("f")){
            System.out.println("生日快乐\n" +
                    "祝你生日快乐\n" +
                    "祝你生日快乐\n" +
                    "祝你生日快乐\n" +
                    "祝你永远快乐");
        }else if(selection.contains("g")){
            System.out.println("Shuvo jonmodin tomay\n" +
                    "Shuvo jonmodin tomay\n" +
                    "Shuvo jonmodin " + name + "!\n" +
                    "Shuvo jonmodin tomay\n" +
                    "https://lyricstranslate.com");
        }else if(selection.contains("h")){
            System.out.println("С днем рожденья тебя\n" +
                    "С днем рожденья тебя!\n" +
                    "С днем рожденья," + name + "! \n" +
                    "С днем рожденья тебя!\n" +
                    "https://lyricstranslate.com");
        }else if(selection.contains("i")){
            System.out.println("Parabéns pra você,\n" +
                    "Nesta data querida.\n" +
                    "Muitas felicidades,\n" +
                    "Muitos anos de vida.\n" +
                    "Hoje é dia de festa,\n" +
                    "Cantam as nossas almas.\n" +
                    "Para o/a menino/a" +name + ",\n" +
                    "Uma salva de palmas.");
        }else if(selection.contains("j")){
            System.out.println("Panjang umurnya\n" +
                    "Panjang umurnya\n" +
                    "Panjang umurnya\n" +
                    "Serta mulia\n" +
                    "Serta mulia\n" +
                    "Serta mulia\n" +
                    "\n" +
                    "Selamat ulang tahun kami ucapkan\n" +
                    "Semoga panjang umur kami kan doakan\n" +
                    "Selamat sejahtera sehat sentosa\n" +
                    "Selamat panjang umur dan bahagia");
        }else if(selection.contains("k")){
            System.out.println(" ");
        }else if(selection.contains("l")){
            System.out.println(" ");
        }else if(selection.contains("m")){
            System.out.println(" ");
        }else if(selection.contains("n")){
            System.out.println(" ");
        }else if(selection.contains("o")){
            System.out.println(" ");
        }else{
            System.out.println("Selection invalid please try again");
        }
        //System.out.println("You chose " + selection);
    }
}
