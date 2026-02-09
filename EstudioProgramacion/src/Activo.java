public abstract class Activo {
    private int codigoInventario;
    private String nombre;

    public Activo(int codigoInventario, String nombre) {
        this.codigoInventario = codigoInventario;
        this.nombre = nombre;
    }

    public int getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(int codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
