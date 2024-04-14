package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento;


    public Producto() {
    }

    // Métodos accesores (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        if (descuento >= 0 && descuento <= 50) {
            this.descuento = descuento;
        } else {
            System.out.println("El descuento debe estar entre 0 y 50. No se ha establecido el descuento.");
        }
    }

    // Método para calcular el precio con descuento
    public double calcularDescuento() {
        if (descuento > 0 && descuento <= 50) {
            double descuentoAplicado = (descuento / 100.0) * precio;
            return precio - descuentoAplicado;
        } else {
            return precio;
        }
    }
}
