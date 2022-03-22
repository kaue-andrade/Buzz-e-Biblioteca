//Algoritmo continuado por Kauê Andrade dos Santos.

package com.company;

import java.util.Scanner;
//Capacete retrátil
//6 frases
//Dispara Laser
//Braço articulado para golpes
//Abre as asas

public class Buzz {

    /*Para entender melhor o funcionamento do Buzz Lightyear foi assistido uma cena do filme
    Link da cena no YouTube: https://youtu.be/pQvba08JZpo*/

    //Atributos
    private boolean asas;
    private boolean laser;
    private boolean capacete;
    private boolean braco;

    Scanner read = new Scanner(System.in);

    //Métodos

    public void abreAsas(){

        System.out.print("\nDeseja abrir as asas de Buzz Lightyear (true ou false)? ");
        boolean asas = read.nextBoolean();

        if (asas == true){
            System.out.println("\nAsas abertas, Comandante!");
            asas = false;
        } else{
            System.out.println("\nAsas fechadas, Comandante!");
            asas = true;
        }
    }

    public String frases(int frase){
        switch (frase){
            case 1:
                return "Ao infinito e além! \uD83D\uDE80";
            case 2:
                return "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora! \uD83D\uDE80";
            case 3:
                return "Buzz Lightyear em ação! \uD83D\uDE80";
            case 4:
                return "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta. \uD83D\uDE80";
            case 5:
                return "Preparando para voar! \uD83D\uDE80";
            case 6:
                return "Saudações, eu sou o Buzz Lightyear e venho em missão de paz. \uD83D\uDE80";

        }
        return "";
    }

    public void disparaLaser() {

        System.out.print("\nDisparar laser, Comandante (true ou false)? ");
        boolean laser = read.nextBoolean();

        if (laser == true) {
            System.out.println("\nO Laser foi disparado, Comandante!");
            laser = false;
        } else {
            System.out.println("\nO laser não foi disparado, Comandante!");
            laser = true;
        }
    }

    public void retrairCapacete() {

        System.out.print("\nEstamos em um solo seguro, Comandante! Retrair capacete (true ou false)? ");
        boolean capacete = read.nextBoolean();

        if (capacete == true) {
            System.out.println("\nCapacete retraído com sucesso, Comandante! Vamos explorar esse novo ambiente! \uD83D\uDC68\u200D");
            capacete = false;
        } else {
            System.out.println("\nCerto, Comandante! O capacete não foi retraído!");
            capacete = true;
        }
    }
    public void articularBraco(){

        System.out.print("\nArticular braços para golpes, Comandante (true ou false)? ");
        boolean braco = read.nextBoolean();

        if (braco == true){

            System.out.println("\nGolpe de karatê!");
        } else {
            System.out.println("\nNenhum golpe foi articulado, Comandante!");
            braco = true;
        }
    }
}
