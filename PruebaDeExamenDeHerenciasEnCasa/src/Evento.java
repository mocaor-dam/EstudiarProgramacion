import java.util.Random;

public enum Evento {
    CORTE_TARTA,MUSICA_ALTA,MUSICA_BAJA,CHARLITA_COLOQUIAL,BAILE,PINATA,APERTURA_REGALOS;

    public static Evento eventoAleatorio(){
        Evento[] values = values();
        return values[new Random().nextInt(values().length)];
    }
}
