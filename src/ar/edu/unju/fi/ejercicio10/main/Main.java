package ar.edu.unju.fi.ejercicio10.main;

import ar.edu.unju.fi.ejercicio10.model.Pizza;
import ar.edu.unju.fi.ejercicio8.excepion.Exception;

import java.util.Scanner;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 14-04-2024
     *
     * Ejercicio 10: Clase Pizza
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos Pizza a partir de la entrada del usuario
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos para la Pizza " + i + ":");
            System.out.print("Diámetro (20, 30 o 40): ");
            int diametro = Exception.getIntegerException();

            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
            boolean tieneIngredientesEspeciales = scanner.nextBoolean();

            // Crear objeto Pizza con los datos ingresados
            Pizza pizza = new Pizza();
            pizza.setDiametro(diametro);
            pizza.setIngredientesEspeciales(tieneIngredientesEspeciales);

            // Calcular precio y área de la pizza
            pizza.calcularPrecio();
            pizza.calcularArea();

            // Mostrar los datos ingresados y los resultados
            System.out.println();
            System.out.println("** Pizza " + i + " **");
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + String.format("%.2f$", pizza.getPrecio()));
            System.out.println("Área de la pizza = " + String.format("%.12f", pizza.getArea()));
            System.out.println("---------------------------------------------");
        }

        scanner.close(); // Cerrar Scanner
    }
}
