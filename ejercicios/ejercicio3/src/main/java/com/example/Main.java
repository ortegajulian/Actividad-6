package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("ingrese la base del triangulo:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        int num2 = scanner.nextInt();
        int areaTriángulo = (num1 * num2);
        System.out.println("El area del triangulo es " + areaTriángulo);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("ingrese el primer lado del cuadrado:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo lado del cuadrado");
        int num2 = scanner.nextInt();
        int areaCuadrado = (num1 * num2);
        System.out.println("El area del cuadrado es " + areaCuadrado);

    }

    private static void calcularRectangulo(Scanner scanner) {

        System.out.println("ingrese la base del rectangulo:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int num2 = scanner.nextInt();
        int areaRectangulo = (num1 * num2);
        System.out.println("El area del rectangulo es " + areaRectangulo);

    }

    private static void calcularCirculo(Scanner scanner) {

        System.out.println("ingrese el radio del circulo:");
        int num1 = scanner.nextInt();
        double areaCirculo = (Math.PI * num1);
        System.out.println("El area del circulo es " + areaCirculo);


    }
}
