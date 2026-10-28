import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;


        while (opcion < 7) {
            interfaz();


            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        break;

                    }
                    case 2 -> {
                        break;

                    }
                    case 3 -> {

                        break;
                    }
                    case 4 -> {
                        break;

                    }
                    case 5 -> {
                        break;

                    }
                    case 6 -> {
                        break;

                    }
                    case 7 -> {
                        break;

                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());            }
        }

    }
    public static void interfaz() {
        System.out.println("\n=== Bienvenido al menu de gestion del concesionario ===");
        System.out.println("1. Cargar informacion desde fichero CSV");
        System.out.println("2. Insertar un coche en una posición concreta");
        System.out.println("3. Ordenar el fichero por matrícula");
        System.out.println("4. Borrar un registro (por Matrícula o Posición)");
        System.out.println("5. Modificar el registro de una posición dada");
        System.out.println("6. Mostrar todos los registros de la BBDD");
        System.out.println("7. Salir");
        System.out.print("Elige una opción (1-7): ");
    }

}

