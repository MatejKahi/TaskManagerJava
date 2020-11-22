package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println(".");

                ArrayList<String> uloziste = new ArrayList<String>();

                int akce = 0;
                int pocetuloh = 0;

                while (akce != 4) {

                    System.out.println("Možnosti:");
                    System.out.println("1. vytvořit");
                    System.out.println("2. upravit");
                    System.out.println("3. smazat");
                    System.out.println("4. odejít");

                    akce = in.nextInt();

                    if (akce == 1) {

                        System.out.println("Vytvoř text");

                        System.out.println("Zadej text:");

                        String input = in.next();

                        uloziste.add(input);

                        pocetuloh++;
                        System.out.println("Počet úloh: " + pocetuloh);
                    }

                    if (akce == 2) {

                        System.out.println("Jakou pozici chcete smazat? ");

                        int pozice = in.nextInt();

                        System.out.println("Uprav text");

                        String nahrazujicitext = in.next();

                        uloziste.set(pozice - 1, nahrazujicitext);

                        pocetuloh++;
                        System.out.println("Počet úloh: " + pocetuloh);

                    }

                    if (akce == 3) {

                        System.out.println("Jakou pozici chcete smazat? ");

                        int pozicismazat = in.nextInt();

                        uloziste.set(pozicismazat - 1, "");

                        pocetuloh++;
                        System.out.println("Počet úloh: " + pocetuloh);

                    }
                }

                System.out.println("Uložený text: " + uloziste);
                System.out.println("Dokončeno - počet úloh: " + pocetuloh);

            }
        }