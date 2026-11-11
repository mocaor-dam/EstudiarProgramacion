import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GestorDeFichero {
    private static final int MAX_BYTE_MATRICULA = 7;
    private static final int MAX_BYTE_MARCA = 32;
    private static final int MAX_BYTE_MODELO = 32;
    private static final int TAM_REGISTRO = MAX_BYTE_MATRICULA + MAX_BYTE_MARCA + MAX_BYTE_MODELO;


    private static void escribirCampo(RandomAccessFile raf, String texto, int tamanio) throws IOException {
        //Creo un array de byte con el tamaño de la variable "tamanio"
        byte[] resultado = new byte[tamanio];

        //Relleno el array con huecos vacios
        Arrays.fill(resultado,(byte) ' ');

        //Si el texto es distinto de nulo
        if (texto != null){
            //Se convierte el texto a bytes con el charset ISO_8859_1 ya que ese charset 1 caracter equivale a 1 byte
            byte[] textoAByte = texto.getBytes(StandardCharsets.ISO_8859_1);
            //Copio esos bytes en el array
            System.arraycopy(textoAByte, 0, resultado, 0, Math.min(textoAByte.length, tamanio));

        }

        raf.write(resultado);

    }

    private static String leerCampo(RandomAccessFile raf, int tamanio) throws IOException {
        byte[] arrayByte = new byte[tamanio];

        raf.readFully(arrayByte);

        String cadena = new String(arrayByte, StandardCharsets.ISO_8859_1).trim();

        return cadena;
    }

    public static void escribirRegistro(RandomAccessFile raf, String matricula, String marca, String modelo) throws IOException {
        escribirCampo(raf, matricula, MAX_BYTE_MATRICULA);
        escribirCampo(raf, marca, MAX_BYTE_MARCA);
        escribirCampo(raf, modelo, MAX_BYTE_MODELO);
    }

    public static String[] leerRegistro(RandomAccessFile raf) throws IOException {
        String[] registros = new String[3];

        registros[0] = leerCampo(raf, MAX_BYTE_MATRICULA);
        registros[1] = leerCampo(raf, MAX_BYTE_MARCA);
        registros[2] = leerCampo(raf, MAX_BYTE_MODELO);

        return registros;
    }

    public static int obtenerNumRegistros(RandomAccessFile raf) throws IOException {
        int numRegistro = (int) (raf.length()/TAM_REGISTRO);
        return numRegistro;
    }
}
