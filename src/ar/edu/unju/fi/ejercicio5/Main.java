package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 13-04-2024
     *
     * Ejercicio 5: Tabla de multiplicar
     * Estructura For
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 9 ");
        int num = scanner.nextInt();
        if (num < 1 || num > 9) {
            System.out.println("Número fuera del rango, debe estar entre 1 y 9");
        } else {

            System.out.println("Tabla de multiplicar del " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        scanner.close();
    }
}
