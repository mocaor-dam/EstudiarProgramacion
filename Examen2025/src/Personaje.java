import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Personaje {

    private static int MIN_VIDA = 0;
    private static int MIN_KI = 0;
    private static int MAX_KI;
    private static int MAX_VIDA;


    private String nombre;
    private TRaza raza;
    private int nivelDeVida;
    private int nivelDeKi;
    private boolean vivo;
    private Set<Ataque> ataques;

    public Personaje(String nombre, TRaza raza, int nivelDeVida, int nivelDeKi, int MAX_KI, int MAX_VIDA) throws DBException {
        this.nombre = nombre;
        this.raza = raza;
        vivo = true;
        setNivelDeKi(nivelDeKi);
        setNivelDeVida(nivelDeVida);

        this.MAX_KI = MAX_KI;
        this.MAX_VIDA = MAX_VIDA;

        ataques = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TRaza getRaza() {
        return raza;
    }

    public void setRaza(TRaza raza) {
        this.raza = raza;
    }

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public void setNivelDeVida(int nivelDeVida) throws DBException {
        if (nivelDeVida > MAX_VIDA || nivelDeVida < MIN_VIDA) {
            throw new DBException("La vida debe estar entre 0 y el máximo");
        }

        this.nivelDeVida = nivelDeVida;
    }

    public int getNivelDeKi() {
        return nivelDeKi;
    }

    public void setNivelDeKi(int nivelDeKi) throws DBException {
        if (nivelDeKi > MAX_KI || nivelDeKi < MIN_KI) {
            throw new DBException("El ki debe estar entre 0 y el máximo");
        }
        this.nivelDeKi = nivelDeKi;
    }

    public Set<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(Set<Ataque> ataques) {
        this.ataques = ataques;
    }


    public boolean isVivo() {
        return vivo;
    }

    public Ataque mejorAtaque(String nombre) throws DBException {
        return ataques.stream().filter(a -> a.getNombre().equalsIgnoreCase(nombre)).filter(a2 -> a2.getKi() <= this.nivelDeKi)
                .max(Ataque::compareTo).orElseThrow(() -> new DBException("Alvaro friki 2"));
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void addAtaque(Ataque ataque) throws DBException {
        if (!ataques.add(ataque)) {
            throw new DBException("No se ha podido añadir el ataque");
        }
    }


}
