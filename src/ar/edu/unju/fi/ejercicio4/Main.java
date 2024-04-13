package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;
public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 13-04-2024
     *
     * Ejercicio 4: Factorial de un número: num!
     * Estructura While
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 10: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 10) {
            System.out.println("Número fuera del rango, debe estar entre 0 y 10.");
        } else {

            int fact = 1;
            int cont = num;

            while (cont > 0) {
                fact *= cont;
                cont--;
            }

            System.out.println("El factorial de " + num + " es: " + fact);
        }

        scanner.close();
    }
}