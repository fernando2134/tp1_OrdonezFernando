package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
    private int num;
    public CalculadoraEspecial() {
    }

    public int getN() {
        return num;
    }

    public void setN(int n) {
        this.num = num;
    }

    // Método para calcular la sumatoria
    public double calcularSumatoria() {
        double sumatoria = 0;

        for (int k = 1; k <= num; k++) {
            double termino = (k * (k + 1) / 2.0) * (k * (k + 1) / 2.0);
            sumatoria += termino;
        }

        return sumatoria;
    }

    // Método para calcular la productoria
    public double calcularProductoria() {
        double productoria = 1;

        for (int k = 1; k <= num; k++) {
            double termino = k * (k + 4);
            productoria *= termino;
        }

        return productoria;
    }
}
