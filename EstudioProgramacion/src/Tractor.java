import io.MiEntradaSalida;

import java.util.Random;

public class Tractor extends Maquinaria{
    private int potenciaCaballos;
    private TipoDeCombustible tipoDeCombustible;

    private final double COSTE_BASE_REVISION_TRACTOR = 100;



    public Tractor(int anoDeCompra, int numSerie, int codigoDeCompra, String nombre, int potenciaCaballos, TipoDeCombustible tipoDeCombustible, boolean estaRevisado) {
        super(anoDeCompra, numSerie, codigoDeCompra, nombre, estaRevisado);
        this.potenciaCaballos = potenciaCaballos;
        this.tipoDeCombustible = tipoDeCombustible;
    }


    public int getPotenciaCaballos() {
        return potenciaCaballos;
    }

    public void setPotenciaCaballos(int potenciaCaballos) {
        this.potenciaCaballos = potenciaCaballos;
    }

    public TipoDeCombustible getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(TipoDeCombustible tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }



    @Override
    public double revisar() {
        setEstaRevisado(true);
        return COSTE_BASE_REVISION_TRACTOR + (this.getPotenciaCaballos()*2);
    }

    @Override
    public double[] localizar() {
        var X = Math.random() * 100;
        var Y = Math.random() * 100;
        return new double[]{X,Y};

    }
}
