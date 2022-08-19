package examen1p2_kevinbanegas;
import java.util.ArrayList;
import java.util.Random;

public class Jugadores {
    private Random r = new Random();
    private String nombre;
    private int id;
    private String contraseña;
    private Personajes personaje;

    public Jugadores(ArrayList<Personajes> personaje) {
        int cant = 2+r.nextInt(10);
        for (int i = 1; i < cant; i++) {
            nombre+=(char)(97+r.nextInt(122));
            contraseña+=(char)(97+r.nextInt(122));
        }
        id=1+r.nextInt(1000);
        this.personaje=personaje.get(0+r.nextInt(personaje.size()-1));
    }

    public Jugadores(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        id=1+r.nextInt(1000);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Personajes getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personajes personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", id=" + id + ", contrase\u00f1a=" + contraseña + ", personaje=" + personaje + '}';
    }
    
    
}
