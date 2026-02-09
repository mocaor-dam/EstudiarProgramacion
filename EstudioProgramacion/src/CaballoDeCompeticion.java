public class CaballoDeCompeticion extends Ganado implements Rastreable{
    private String raza;
    private int numCarrerasGanadas;

    private final double PRECIO_BASE_CABALLOS = 100;

    public CaballoDeCompeticion(int codigoInventario, String nombre, int fechaDeNacimiento, String raza, int numCarrerasGanadas) {
        super(codigoInventario, nombre, fechaDeNacimiento);
        this.raza = raza;
        this.numCarrerasGanadas = numCarrerasGanadas;
    }

    @Override
    public double controlarVeterinario(int ano){
        return PRECIO_BASE_CABALLOS;
    }

    @Override
    public double[] localizar() {
        var X = Math.random() * 100;
        var Y = Math.random() * 100;
        return new double[]{X,Y};
    }
}
