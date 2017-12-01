package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Koki veiksam noretumete atlikti?");
            System.out.println("1-- Suma");
            System.out.println("2-- Skirtumas");
            System.out.println("3-- Sandauga");
            System.out.println("0-- Iseiti");
            Scanner skaneris = new Scanner(System.in);
            int a = skaneris.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Iveskite Du skaicius");
                    int b = skaneris.nextInt();
                    int c = skaneris.nextInt();
                    int suma = b + c;
                    System.out.println(b + " ir " + c + " suma yra: " + suma);

                    break;
                case 2:
                    System.out.println("Iveskite Du skaicius");
                    b = skaneris.nextInt();
                    c = skaneris.nextInt();
                    int skirtumas = b - c;
                    System.out.println(b + " ir " + c + " skirtumas yra: " + skirtumas);
                    break;
                case 3:
                    System.out.println("Iveskite Du skaicius");
                    b = skaneris.nextInt();
                    c = skaneris.nextInt();
                    int sandauga = b * c;
                    System.out.println(b + " ir " + c + " sandauga yra: " + sandauga);
                    break;
                case 0:
                    System.out.println("Geros dienos");
                    return;
                default:
                    System.out.println("Netinkamas pasirinkimas");
            }
        }


    }
}
