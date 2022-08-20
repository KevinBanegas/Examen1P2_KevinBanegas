package examen1p2_kevinbanegas;

public class Rastraeador extends Personajes {

    public Rastraeador(String nombre, double vida, int escudo, Armas arma) {
        super(nombre, vida, escudo, arma);
    }


    public Rastraeador(String nombre, Armas arma) {
        super(nombre, arma);
    }

    @Override
    public void Atacar(Personajes personaje) {
        double preci = super.getArma().getPrecision();
        super.getArma().setPrecision(preci + (preci * 0.1));
        if (personaje instanceof Medico) {
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp - (super.getArma().getDaño() * 1.1));
        } else if (personaje instanceof Fortaleza) {
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp - ((super.getArma().getDaño() * 1.1) * 0.85));
        } else {
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp - super.getArma().getDaño());
        }

    }
}
