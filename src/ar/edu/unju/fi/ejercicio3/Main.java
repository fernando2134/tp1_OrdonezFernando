package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 13-04-2024
     *
     * Ejercicio 3: Uso Scanner
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número : ");
        int num = scanner.nextInt();

        int resultado = 0;
        if (num % 2 != 0) {
            resultado = num * 2;
            System.out.println("El número es impar y su doble es: " + resultado);
        } else {
            resultado = num * 3;
            System.out.println("El número es par y su triple es: " + resultado);
        }
        scanner.close();
    }
}


