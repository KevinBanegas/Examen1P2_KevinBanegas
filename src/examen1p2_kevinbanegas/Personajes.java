package examen1p2_kevinbanegas;

import java.util.Random;


public class Personajes {
    protected Random r = new Random();
    protected String nombre;
    protected double vida;
    protected int escudo;
    protected Armas arma;
    protected double vidatot;
    public Personajes() {
        
    }

    public Personajes(String nombre, Armas arma) {
        this.nombre = nombre;
        this.vida = 50+r.nextInt(50);
        this.escudo = 0+r.nextInt(100);
        this.vidatot = escudo+vida;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
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

    public double getVidatot() {
        return vidatot;
    }

    public void setVidatot(double vidatot) {
        this.vidatot = vidatot;
    }
    
    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", vida=" + vida + ", escudo=" + escudo + ", arma=" + arma + '}';
    }
    
    public void Atacar(Personajes personaje){
        
    }
}
