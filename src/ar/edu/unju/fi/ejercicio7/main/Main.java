package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.excepion.Exception;
import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 14-04-2024
     *
     * Ejercicio 7: Calculo de salario
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos para un nuevo empleado:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Legajo: ");
        int legajo = scanner.nextInt();
        System.out.print("Salario $: ");
        double salario = Exception.getSalarioException();


        Empleado empleado = new Empleado(nombre, legajo, salario);
        System.out.println("Datos del empleado antes del aumento:");
        empleado.mostrarDatos();
        empleado.darAumento();
        System.out.println();
        System.out.println("Datos del empleado después del aumento:");
        empleado.mostrarDatos();

        scanner.close();
    }
}
