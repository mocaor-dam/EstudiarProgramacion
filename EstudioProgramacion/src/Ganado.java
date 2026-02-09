public abstract class Ganado extends Activo implements Certificable{
    private int ano;

    public Ganado(int codigoInventario, String nombre, int fechaDeNacimiento) {
        super(codigoInventario, nombre);
        this.ano = fechaDeNacimiento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double controlarVeterinario(int ano) {
        return 0;
    }
}
