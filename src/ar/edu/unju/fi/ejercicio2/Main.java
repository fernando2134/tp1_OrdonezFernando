package ar.edu.unju.fi.ejercicio2;

public class Main {
    /**
     * @author Fernando Ordoñez
     * @since 13-04-2024
     *
     * Ejercicio 2: Almacenar datos
     *
     */
    public static void main(String[] args) {

        String nombPais, nroTelefono;
        int edadPersona;
        double alturaEdificio, precioProducto, cosenoDeCincuentaGrados;

        nombPais="Argentina"; edadPersona= 30; alturaEdificio = 50.5; precioProducto = 99.99; nroTelefono = "388-4123876";

        double angulo = 50.0;
        cosenoDeCincuentaGrados = Math.cos(Math.toRadians(angulo));

        System.out.println("**********Mostrar Datos***********");
        System.out.println("Nombre del país: " + nombPais);
        System.out.println("Edad de la persona: " + edadPersona + " años");
        System.out.println("Altura del edificio: " + alturaEdificio + " metros");
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Número de teléfono: " + nroTelefono);
        System.out.println("Coseno de 50° grados: " + cosenoDeCincuentaGrados);
    }





}