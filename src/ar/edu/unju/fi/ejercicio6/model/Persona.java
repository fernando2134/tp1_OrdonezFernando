package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;


    public Persona() {
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }



    // Método para calcular la edad
    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        return ahora.getYear() - fechaNacimiento.getYear();
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorEdad() {
        return calcularEdad() >= 18;
    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {
        System.out.println("DNI: " + dni );
        System.out.println("Nombre: " + nombre );
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento );
        System.out.println("Provincia: " + provincia );
        int edad = calcularEdad();
        System.out.println("Edad: " + edad);
        if (esMayorEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}
