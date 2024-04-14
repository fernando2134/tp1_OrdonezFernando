package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    /**
     * @author Fernando Ordoñez
     * @since 14-04-2024
     *
     * Ejercicio 12: Uso de Calendar
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre de la persona: ");
        String nombre = scanner.nextLine();

        try {
            System.out.print("Ingrese fecha de nacimiento (en formato DD/MM/YYYY): ");
            String fechaNacimientoStr = scanner.nextLine();

            String[] partesFecha = fechaNacimientoStr.split("/");
            if (partesFecha.length != 3) {
                throw new IllegalArgumentException("Formato de fecha incorrecto. Debe ser DD/MM/YYYY.");
            }

            int dia = Integer.parseInt(partesFecha[0]);
            int mes = Integer.parseInt(partesFecha[1]) - 1;
            int anio = Integer.parseInt(partesFecha[2]);

            Calendar fechaNacimiento = Calendar.getInstance();
            fechaNacimiento.setLenient(false); // Para validar la fecha de forma estricta
            fechaNacimiento.set(anio, mes, dia);

            Persona persona = new Persona(nombre, fechaNacimiento);


            System.out.println("Datos de la persona:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Fecha de nacimiento: " + fechaNacimientoStr);

            if(persona.calcularEdad()<0){
                System.out.println("Edad incorrecta, ingreso mal el año");
            }else{
                int edad = persona.calcularEdad();
                System.out.println("Edad: " + edad + " años");
            }

            String signoZodiaco = persona.obtenerSignoZodiaco();
            System.out.println("Signo del zodiaco: " + signoZodiaco);

            String estacion = persona.obtenerEstacion();
            System.out.println("Estación del año: " + estacion);


        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada de fecha de nacimiento no es válida. Intente de nuevo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
