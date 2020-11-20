package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TodoApp FONT");
        String[] uloziste = new String[10];
        int akce = 0;
        int pozice = 0;
        while (akce != 4) {
            System.out.println("Možnosti:");
            System.out.println("1. vytvořit");
            System.out.println("2. upravit");
            System.out.println("3. smazat");
            System.out.println("4. odejít");
            akce = in.nextInt();
            if (akce == 1) {
                System.out.println("akce vytvořit");
                System.out.println("zadej text:");
                String input = in.next();
                uloziste[pozice] = input;
                pozice++;
            }
            if (akce == 3) {
                System.out.println("Jakou pozici chcete smazat? ");
                int pozicismazat = in.nextInt();
                uloziste[pozicismazat] = "";
                for (int i = 0; i < 10; i++) {
                    System.out.println(uloziste[i]);

                }

            }
        }
    }
}