public class VacaLechera extends Ganado{
    private double litrosLeche;
    private static final int DIAS_SEMANA = 7;

    private final double PRECIO_BASE = 50;
    private final double PRECIO_JOVEN = 30;


    public VacaLechera(int codigoInventario, String nombre, int fechaDeNacimiento, double litrosLeche) {
        super(codigoInventario, nombre, fechaDeNacimiento);
        this.litrosLeche = litrosLeche;
    }

    public double getLitrosLeche() {
        return litrosLeche;
    }

    public void setLitrosLeche(double litrosLeche) {
        this.litrosLeche = litrosLeche;
    }

    @Override
    public double controlarVeterinario(int ano){
        if (getAno() > 5){
            return PRECIO_BASE;
        }
        return PRECIO_JOVEN;
    }
}
