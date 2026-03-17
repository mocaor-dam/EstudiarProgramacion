import exceptions.CumpleException;

public class Familiar extends Invitado{



    public Familiar(String nombre, int hambre, int aburrimiento) throws CumpleException {
        super(nombre, hambre, aburrimiento);
    }





    //Sobrescritura de metodos
    @Override
    public void reaccionar(Evento evento) {
        switch (evento){
            case CORTE_TARTA -> {

            }
        }

    }

    @Override
    public void pasarHambre() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void aburrirse() {

    }

    @Override
    public void divertirse() {

    }

    @Override
    public void irseDeLaFiesta() {
        if (getHambre() == 100 || getAburrimiento() <= 100 ){
            setEstaEnLaFiesta(false);
        }
    }
}
