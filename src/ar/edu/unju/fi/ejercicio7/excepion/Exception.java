package ar.edu.unju.fi.ejercicio7.excepion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fernando Ordoñez
 * @since 14-04-2024
 *
 * Exception ejercicio 7
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
    public static Double getSalarioException() {
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Error: ¡Debe ingresar un número válido para el salario! y su error es " +e.getMessage());
            System.exit(0);
        }
        return null;
    }


}
