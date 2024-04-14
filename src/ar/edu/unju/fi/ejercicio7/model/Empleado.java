package ar.edu.unju.fi.ejercicio7.model;

import ar.edu.unju.fi.ejercicio7.constantes.Constantes;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;


    // Constructor parametrizado
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        // Asignación del salario con lógica de validación
       // this.salario = (salario >= Constantes.SALARIO_MINIMO) ? salario : Constantes.SALARIO_MINIMO;
        this.salario = Math.max(salario, Constantes.SALARIO_MINIMO);
    }

    // Método para mostrar los datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + String.format("%.2f", salario));
    }

    // Método para dar un aumento al salario del empleado
    public void darAumento() {
        salario += Constantes.AUMENTO_POR_MERITOS;
    }
}
