package examen1p2_kevinbanegas;


public class Fortaleza extends Personajes{

    public Fortaleza() {
    }

    public Fortaleza(String nombre, Armas arma) {
        super(nombre, arma);
    }
    
    @Override
    public void Atacar(Personajes personaje){
        if (personaje instanceof Medico) {
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp-(super.getArma().getDaño()*1.1)); 
        }else if (personaje instanceof Fortaleza){
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp-(super.getArma().getDaño()*0.85)); 
        }else{
            double temp = personaje.getVidatot();
            personaje.setVidatot(temp-super.getArma().getDaño()); 
        }
    }
}
