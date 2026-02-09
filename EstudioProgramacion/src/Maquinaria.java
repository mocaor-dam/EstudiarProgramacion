public abstract class Maquinaria extends Activo implements Mantenible, Rastreable {
    private int anoDeCompra;
    private int numSerie;
    private boolean estaRevisado;

    public Maquinaria(int anoDeCompra, int numSerie, int codigoDeCompra, String nombre, boolean estaRevisado) {
        super(codigoDeCompra, nombre);
        this.anoDeCompra = anoDeCompra;
        this.numSerie = numSerie;
        this.estaRevisado = false;
    }

    public int getAnoDeCompra() {
        return anoDeCompra;
    }

    public void setAnoDeCompra(int anoDeCompra) {
        this.anoDeCompra = anoDeCompra;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setEstaRevisado(boolean estaRevisado) {
        this.estaRevisado = estaRevisado;
    }
}
