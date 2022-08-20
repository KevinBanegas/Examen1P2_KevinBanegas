package examen1p2_kevinbanegas;

public class Medico extends Personajes {

    public Medico(String nombre, double vida, int escudo, Armas arma) {
        super(nombre, vida, escudo, arma);
    }



    public Medico(String nombre, Armas arma) {
        super(nombre, arma);
    }

    @Override
    public void Atacar(Personajes personaje) {
        super.vidatot = super.vidatot + (super.vidatot * (1 + r.nextInt(9) * 0.01));
        if (personaje instanceof Rastraeador) {
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp - (super.getArma().getDaño() * 1.05));
        } else if (personaje instanceof Fortaleza) {
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp - (super.getArma().getDaño() * 0.85));
        } else {
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp - super.getArma().getDaño());
        }
    }
}
