public class Cosechadora extends Maquinaria implements Mantenible{
    private double capacidadTolva;
    private double anchoDeCorte;

    private final double COSTE_BASE_COSECHADORAS = 500;

    public Cosechadora(int anoDeCompra, int numSerie, int codigoDeCompra, String nombre, double capacidadTolva, double anchoDeCorte, boolean estaRevisado) {
        super(anoDeCompra, numSerie, codigoDeCompra, nombre, estaRevisado);
        this.capacidadTolva = capacidadTolva;
        this.anchoDeCorte = anchoDeCorte;
    }

    @Override
    public double revisar() {
        setEstaRevisado(true);
        return COSTE_BASE_COSECHADORAS;
    }

    @Override
    public double[] localizar() {
        var X = Math.random() * 100;
        var Y = Math.random() * 100;
        return new double[]{X,Y};

    }
}
