import java.util.Objects;

public class Ataque implements Comparable<Ataque>{

    private static final int MIN_KI = 0;
    private static final int MIN_PERFECCION = 1;
    private static final int MAX_PERFECCION = 3;
    private static final int MIN_DANIO = 0;

    private String nombre;
    private int ki;
    private int perfeccion;
    private int danio;


    public Ataque(String nombre, int ki, int perfeccion, int danio) throws DBException {
        setNombre(nombre);
        setKi(ki);
        setPerfeccion(perfeccion);
        setDanio(danio);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws DBException {
        if (nombre == null || nombre.isBlank()) {
            throw new DBException("el ataque debe tener nombre");
        }
        this.nombre = nombre;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) throws DBException {
        if (ki <= MIN_KI) {
            throw new DBException("el ki debe ser mayor que cero");
        }
        this.ki = ki;
    }

    public int getPerfeccion() {
        return perfeccion;
    }

    public void setPerfeccion(int perfeccion) throws DBException {
        if (perfeccion < MIN_PERFECCION || perfeccion > MAX_PERFECCION) {
            throw new DBException("La perfeccion debe estar entre 1 y 3");
        }
        this.perfeccion = perfeccion;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) throws DBException {
        if (danio <= MIN_DANIO) {
            throw new DBException("El daño debe ser mayor que cero");
        }
        this.danio = danio;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ataque ataque)) return false;
        return perfeccion == ataque.perfeccion && danio == ataque.danio && Objects.equals(nombre, ataque.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, perfeccion, danio);
    }

    @Override
    public int compareTo(Ataque o) {
       return  o.getDanio() - this.getDanio();
    }
}
