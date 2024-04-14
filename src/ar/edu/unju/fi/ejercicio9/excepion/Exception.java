package ar.edu.unju.fi.ejercicio9.excepion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fernando Ordoñez
 * @since 14-04-2024
 *
 * Exception ejercicio 9
 *
 */
public class Exception {

    /**
     *
     * @param
     * @return Double
     * @Method Valida si es una numero es correcto
     *
     */
    public static Double getDoubleException() {
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Error: ¡Debe ingresar un número válido! y su error es " + e.getMessage());
            System.exit(0);
        }
        return null;
    }

    /**
     *
     * @param
     * @return Integer
     * @Method Valida si es una numero es correcto
     *
     */

    public static Integer getIntegerException() {
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error: ¡Debe ingresar un número válido! y su error es " + e.getMessage());
            System.exit(0);
        }
        return null;
    }

}
