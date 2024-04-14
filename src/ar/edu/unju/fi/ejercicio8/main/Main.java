package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.excepion.Exception;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 14-04-2024
     *
     * Ejercicio 8: Sumatoria y productoria
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int valor = Exception.getIntegerException();

        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(valor);

        double sumatoria = calculadora.calcularSumatoria();
        double productoria = calculadora.calcularProductoria();


        System.out.println("Resultados para n = " + valor);
        System.out.println("Sumatoria: " + sumatoria);
        System.out.println("Productoria: " + productoria);

        scanner.close();
    }
}
