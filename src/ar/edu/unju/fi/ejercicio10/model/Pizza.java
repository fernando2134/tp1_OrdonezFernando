package ar.edu.unju.fi.ejercicio10.model;
public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // Constantes de adicionales por ingredientes especiales
    private static final double ADICIONAL_ESPECIALES_20 = 500.00;
    private static final double ADICIONAL_ESPECIALES_30 = 750.00;
    private static final double ADICIONAL_ESPECIALES_40 = 1000.00;

    // Constructor por defecto
    public Pizza() {
        // Inicialización por defecto
    }

    // Métodos accesores (getters y setters)
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    public void calcularPrecio() {
        if (diametro == 20) {
            if (ingredientesEspeciales) {
                precio = 4500.00 + ADICIONAL_ESPECIALES_20;
            } else {
                precio = 4500.00;
            }
        } else if (diametro == 30) {
            if (ingredientesEspeciales) {
                precio = 4800.00 + ADICIONAL_ESPECIALES_30;
            } else {
                precio = 4800.00;
            }
        } else if (diametro == 40) {
            if (ingredientesEspeciales) {
                precio = 5500.00 + ADICIONAL_ESPECIALES_40;
            } else {
                precio = 5500.00;
            }
        } else {
            System.out.println("Diámetro inválido. Los valores permitidos son: 20, 30, 40.");
        }
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * radio * radio;
    }
}
