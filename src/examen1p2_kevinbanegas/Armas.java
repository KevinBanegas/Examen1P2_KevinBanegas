package examen1p2_kevinbanegas;

import java.util.Random;

public class Armas {

    private Random r = new Random();
    private String nombre;
    private int daño;
    private double precision;

    public Armas() {
    }

    public Armas(String nombre, int daño, int precision) {
        this.nombre = nombre;
        this.daño = daño;
        this.precision = precision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public double getPrecision() {

        return precision;
    }

    public void setPrecision(double precision) {
        if (precision <= 100 && precision >= 0) {
            this.precision = precision;
        } else {
            this.precision = 10;
        }
    }

    @Override
    public String toString() {
        return nombre;
    }

}
