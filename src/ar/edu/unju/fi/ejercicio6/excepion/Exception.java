package ar.edu.unju.fi.ejercicio6.excepion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Fernando Ordoñez
 * @since 13-04-2024
 *
 * Exception ejercicio 6
 *
 */
public class Exception {

    /**
     *
     * @param
     * @return LocalDate
     * @Method Valida si es una fecha valida
     *
     */
    public static LocalDate getFechaNacimientoException() {
        Scanner scanner = new Scanner(System.in);
        try {
            String fechaNacimientoCadena = scanner.nextLine();
            // Validar el formato de la fecha de nacimiento
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoCadena, formatter);
            return fechaNacimiento;
        } catch (RuntimeException e) {
            System.out.println("Ingreso mal fecha del nacimiento y su error es " +e.getMessage());
            System.exit(0);
        }
        return null;
    }

    /**
     *
     * @param
     * @return String
     * @Method Valida si es una dni valido
     */


    public static String getDniException() {
        Scanner scanner = new Scanner(System.in);
        try {
            // Validar el formato de dni
            String dniCadena = scanner.nextLine();
            int dni = Integer.parseInt(dniCadena);
            return dniCadena;

        } catch (RuntimeException e) {
            System.out.println("Ingreso mal el dni y su error es " +e.getMessage());
            System.exit(0);
        }
        return null;
    }

}
