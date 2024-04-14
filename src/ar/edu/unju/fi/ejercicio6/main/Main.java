package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.util.Scanner;
import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio6.excepion.Exception;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 14-04-2024
     *
     * Ejercicio 6: Creacion de objeto Persona
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Persona por defecto
        Persona persona1 = new Persona();
        System.out.println("Datos de Persona 1 (Constructor por defecto):");

        System.out.print("DNI: ");
        String dni1 = Exception.getDniException();
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        LocalDate localDa = Exception.getFechaNacimientoException();
        System.out.print("Provincia: ");
        String provincia1 = scanner.nextLine();

        persona1.setDni(dni1);
        persona1.setNombre(nombre1);
        persona1.setFechaNacimiento(localDa);
        persona1.setProvincia(provincia1);
        System.out.println("Datos de Persona 1:");
        persona1.mostrarDatos();


        // Persona 2 objeto parametrizado(ingresan por consola)
        System.out.println("Ingrese datos para Persona 2 (Constructor parametrizado):");

        System.out.print("DNI: ");
        String dni2 = Exception.getDniException();
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Provincia: ");
        String provincia2 = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");


        LocalDate fechaNacimiento2 = Exception.getFechaNacimientoException();


        //Instanciar objeto Persona paramtrizado
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        System.out.println("Datos de Persona 2:");
        persona2.mostrarDatos();


        //Persona 3 con atributo de provincia inicializado en Jujuy
        System.out.println("Ingrese datos para Persona 3:");
        System.out.print("DNI: ");
        String dni3 = Exception.getDniException();
        System.out.print("Nombre: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento3 = Exception.getFechaNacimientoException();


        //Instanciar objeto Persona con parametro ya inicializado en  Jujuy
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
        System.out.println("Datos de Persona 3");
        persona3.mostrarDatos();

        System.out.println("Fin de Programa");
        scanner.close();
    }

}
