import exceptions.CumpleException;

public abstract class Invitado {
    private String nombre;
    private int hambre;
    private int aburrimiento;
    private boolean estaEnLaFiesta;

    private final int MIN_HAMBRE = 0;
    private final int MAX_HAMBRE = 100;

    private final int MIN_ABURRIMIENTO = 0;
    private final int MAX_ABURRIMIENTO = 100;

    private final int MODIFICACION_HAMBRE_CORTE_TARTA = -20;
    private final int MODIFICACION_MUSICA_ALTA = 20;


    public Invitado(String nombre, int hambre, int aburrimiento) throws CumpleException {
        this.nombre = nombre;
        setHambre(hambre);
        setAburrimiento(aburrimiento);
        estaEnLaFiesta = true;
    }


    //Metodos abstractos
    public abstract void reaccionar(Evento evento);

    public abstract void pasarHambre();

    public abstract void comer();

    public abstract void aburrirse();

    public abstract void divertirse();

    public abstract void irseDeLaFiesta();



    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) throws CumpleException {
        if (this.hambre < MIN_HAMBRE){
            throw new CumpleException("El valor del hambre debe ser positivo");
        } else if (this.hambre > MAX_HAMBRE) {
            throw new CumpleException("El valor del hambre debe ser menor que 100");
        }
        this.hambre = hambre;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) throws CumpleException {
        if (this.aburrimiento < MIN_ABURRIMIENTO){
            throw new CumpleException("El valor del aburrimiento debe ser positivo");
        } else if (this.aburrimiento > MAX_ABURRIMIENTO) {
            throw new CumpleException("El valor del aburrimiento debe ser menor que 100");
        }
        this.aburrimiento = aburrimiento;
    }

    public boolean isEstaEnLaFiesta() {
        return estaEnLaFiesta;
    }

    public void setEstaEnLaFiesta(boolean estaEnLaFiesta) {
        this.estaEnLaFiesta = estaEnLaFiesta;
    }
}
