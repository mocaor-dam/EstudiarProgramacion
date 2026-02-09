import exceptions.ActivoNoMecanicoException;
import io.MiEntradaSalida;

import java.util.Arrays;

public class Principal {
    static void main(String[] args) {

        Tractor tractor = new Tractor(2000, 123, 1233, "untractoramarillo", 3000, TipoDeCombustible.DIESEL, false);
        Cosechadora cosechadora = new Cosechadora(300, 12, 3312, "unacosechadoraamarilla", 300.0, 34.0, false);
        VacaLechera vacaLechera = new VacaLechera(33, "paquita", 3, 34.0);
        CaballoDeCompeticion caballoDeCompeticion = new CaballoDeCompeticion(34, "caballito", 4, "amarillo", 77);


        Activo[] activos = new Activo[10];
        activos[0] = tractor;
        activos[1] = cosechadora;
        activos[4] = vacaLechera;
        activos[6] = caballoDeCompeticion;


        System.out.println("1. Listar Inventario Completo");
        System.out.println("2. Control Veterinario");
        System.out.println("3. Localizar");
        System.out.println("4. Enviar a Revision");
        System.out.println("5. Salir");

        String opcion = MiEntradaSalida.leerLinea("Elige la opcion que quieras hacer: ");

        switch (opcion) {
            case "1" -> {
                mostrarActivos(activos);
                break;
            }
            case "2" -> {
                controlVeterinario(activos);
                break;
            }
            case "3" -> {
                rastrear(activos);
                break;
            }
            case "4" -> {
                try {
                    enviarRevision(activos);
                } catch (ActivoNoMecanicoException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }

    public static void mostrarActivos(Activo[] activos) {
        for (int i = 0; i < activos.length; i++) {
            if (activos[i] != null) {
                System.out.println(activos[i].getNombre());
            }
        }

    }

    public static void controlVeterinario(Activo[] activos) {
        double total = 0;
        for (int i = 0; i < activos.length; i++) {
            if (activos[i] != null && activos[i] instanceof Ganado g) {
                total += g.controlarVeterinario(g.getAno());


            }

        }
        System.out.println(total + "€");
    }

    public static void rastrear(Activo[] activos) {
        for (int i = 0; i < activos.length; i++) {
            if (activos[i] != null && activos[i] instanceof Rastreable r) {
                System.out.println(activos[i].getNombre());
                System.out.println(Arrays.toString(r.localizar()));
            }
        }
    }

    public static void enviarRevision(Activo[] activos) throws ActivoNoMecanicoException {
        mostrarActivos(activos);
        int opcion1 = MiEntradaSalida.leerEntero("Selecciona el activo que quieras enviar a revision(0 al 4)");
        if (activos[opcion1] instanceof Mantenible m) {
            System.out.println(m.revisar());
        } else {
            throw new ActivoNoMecanicoException("El activo no se puede llevar a revision");
        }
    }


}
