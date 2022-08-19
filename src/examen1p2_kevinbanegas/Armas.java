package examen1p2_kevinbanegas;

import java.util.Random;


public class Armas {
    private Random r = new Random();
    private String nombre;
    private int daño;
    private int precision;

    public Armas() {
    }

    public Armas(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;
        this.precision = 0+r.nextInt(100);
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

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "Armas{" + "nombre=" + nombre + ", da\u00f1o=" + daño + ", precision=" + precision + '}';
    }
    
    
}
