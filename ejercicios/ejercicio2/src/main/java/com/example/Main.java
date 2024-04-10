
package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 10;
        int max = 20;
        int amplitud = max - min;
        int resultado;

        var numeroAleatorio = Math.random();
        int numeroFinal = (int) (numeroAleatorio * amplitud) + min;

        System.out.println("Número aleatorio entre " + min + " y " + max);
        int intentos = 5;
        do { 
        System.out.println("ingrese un numero entero");
         resultado = scanner.nextInt ();

        if (resultado == numeroFinal) {
            System.out.println("ganaste");

        } if (resultado > numeroFinal){
            System.out.println("es mayor al numero aleatorio" );
            intentos--;
            
        } else if (resultado < numeroFinal) {
             System.out.println("equivocado el numero es menor");
             intentos--;
             
        } if(intentos == 0){
            System.out.println("te quedaste sin intentos, el numero era "+numeroFinal);
            break;
        }
        }
        while (resultado != numeroFinal); 
      

    }
}
