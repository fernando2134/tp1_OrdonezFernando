package ar.edu.unju.fi.ejercicio9.main;


import ar.edu.unju.fi.ejercicio9.excepion.Exception;
import ar.edu.unju.fi.ejercicio9.model.Producto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 14-04-2024
     *
     * Ejercicio 9: Productos
     *
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos Producto a partir de la entrada del usuario
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del Producto " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = Exception.getDoubleException();
            System.out.print("Descuento (% entre 0 y 50): ");
            int descuento = Exception.getIntegerException();


            // Crear objeto Producto con los datos ingresados
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setPrecio(precio);
            producto.setDescuento(descuento);

            // Mostrar los datos ingresados para el producto y el precio con descuento
            System.out.println();
            System.out.println("Datos del Producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento (%): " + producto.getDescuento());
            System.out.println("Precio con Descuento: " + producto.calcularDescuento());
            System.out.println("---------------------------------------------");
        }

        scanner.close();
    }
}
