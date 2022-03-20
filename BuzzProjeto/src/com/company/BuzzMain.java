//Algoritmo continuado por Kauê Andrade dos Santos.

package com.company;

import java.util.Scanner;

public class BuzzMain {
    public static void main(String[] args) {

        Buzz buzz1 = new Buzz();

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nBuzz #1:");

        buzz1.abreAsas();

        System.out.print("\nEscolha uma frase para o Buzz #1 (1 a 6): ");
        int frase1 = leitor.nextInt();
        System.out.println("\nBUZZ LIGHTYEAR: " + buzz1.frases(frase1));

        buzz1.disparaLaser();
        buzz1.retrairCapacete();
        buzz1.articularBraco();

        Buzz buzz2 = new Buzz();

        System.out.println("\nBuzz #2:");

        buzz2.abreAsas();

        System.out.print("\nEscolha uma frase para o Buzz #2 (1 a 6): ");
        int frase2 = leitor.nextInt();
        System.out.println("\nBUZZ LIGHTYEAR: " + buzz1.frases(frase2));

        buzz2.disparaLaser();
        buzz2.retrairCapacete();
        buzz2.articularBraco();

        Buzz buzz3 = new Buzz();

        System.out.println("\nBuzz #3:");

        buzz3.abreAsas();

        System.out.print("\nEscolha uma frase para o Buzz #3 (1 a 6): ");
        int frase3 = leitor.nextInt();
        System.out.println("\nBUZZ LIGHTYEAR: " + buzz1.frases(frase3));

        buzz3.disparaLaser();
        buzz3.retrairCapacete();
        buzz3.articularBraco();
    }
}