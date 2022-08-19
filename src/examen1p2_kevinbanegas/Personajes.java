package examen1p2_kevinbanegas;

import java.util.Random;


public class Personajes {
    protected Random r = new Random();
    protected String nombre;
    protected int vida;
    protected int escudo;
    protected Armas arma;

    public Personajes() {
        
    }

    public Personajes(String nombre, Armas arma) {
        this.nombre = nombre;
        this.vida = 50+r.nextInt(100);
        this.escudo = 50+r.nextInt(100);
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", vida=" + vida + ", escudo=" + escudo + ", arma=" + arma + '}';
    }
    
    
}
