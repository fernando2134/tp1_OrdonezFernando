package ar.edu.unju.fi.ejercicio11;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 14-04-2024
     *
     * Ejercicio 11: Series
     *
     */

    public static void main(String[] args) {
        int j = 40, i = 2, z = 0, num =80;
        System.out.print(num + " ");
        for (; j >= 0; j -= 1) {
            num = num + (37 - i * z);
            if(num>0) {
                System.out.print(num + " ");
            }
            z++;
        }

    }
}

