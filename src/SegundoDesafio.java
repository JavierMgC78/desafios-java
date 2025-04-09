import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Un solo scanner para todo
        String nombre;
        int desicion1;
        boolean orbe = false;

        limpiarConsola();

        // Presentación
        System.out.println("""
                
                ¡Bienvenido a 'El Despertar del Guerrero'!
                Despiertas en una aldea misteriosa sin memoria...
                Solo tienes una espada oxidada y una nota:
                'Encuentra el orbe antes del anochecer. Tu destino está en juego.'
                """);

        //Nombre guerrero
        System.out.print("¿Cuál es tu nombre, guerrero?: ");
        nombre = scanner.nextLine();
        System.out.println("¡Saludos, " + nombre + "! Tu aventura comienza...\n");

        desicion1 = escogerCamino(scanner);
        orbe = camino(desicion1, scanner);

        if (orbe) {
            System.out.print("Tienes el orbe en tus manos. ¿Deseas usarlo (U) o destruirlo (D)? ");
            String capturaFinal = scanner.nextLine().trim().toUpperCase();

            if (!capturaFinal.isEmpty()) {
                char opcion = capturaFinal.charAt(0);
                if (opcion == 'U') {
                    System.out.println("El orbe brilla intensamente... Recuperas tus recuerdos. ¡Eres el guardián del reino!");
                } else if (opcion == 'D') {
                    System.out.println("Destruyes el orbe y salvas al mundo del caos. Te conviertes en leyenda.");
                } else {
                    System.out.println("Dudas demasiado... el orbe desaparece. Tu destino queda incierto.");
                }
            } else {
                System.out.println("No tomas ninguna decisión... el orbe se desvanece.");
            }
        }

        scanner.close();
    }

    // Limpiar consola con saltos de línea
    public static void limpiarConsola() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public static int escogerCamino(Scanner scanner) {
        String message = "";
        int desicion1 = 0;
        boolean whileOk = true;

        while (whileOk) {
            limpiarConsola();
            System.out.println(message);
            System.out.println("Te encuentras en un cruce. ¿A dónde quieres ir?");
            System.out.println("1. Entrar al bosque oscuro");
            System.out.println("2. Explorar la cueva misteriosa");
            System.out.println("3. Volver al pueblo en ruinas");

            System.out.print("Elige 1, 2 o 3: ");
            if (scanner.hasNextInt()) {
                desicion1 = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer
                if (desicion1 >= 1 && desicion1 <= 3) {
                    whileOk = false;
                } else {
                    message = "OPCIÓN INCORRECTA. Intenta de nuevo.";
                }
            } else {
                scanner.nextLine(); // limpiar entrada incorrecta
                message = "ESO NO ES UN NÚMERO VÁLIDO. Intenta de nuevo.";
            }
        }

        return desicion1;
    }

    public static boolean camino(int seleccion, Scanner scanner) {
        limpiarConsola();
        boolean orbe = false;
        String accion = "";

        switch (seleccion) {
            case 1:
                System.out.println("Te adentras en el bosque... una criatura aparece.");
                System.out.print("¿Luchar (L) o Escapar (E)? ");
                accion = scanner.nextLine().trim().toUpperCase();

                if (!accion.isEmpty() && accion.charAt(0) == 'L') {
                    System.out.println("Luchas valientemente y derrotas a la bestia. Encuentras el orbe escondido en un árbol hueco.");
                    orbe = true;
                } else {
                    System.out.println("Escapas con vida, pero sin el orbe. Fin de la aventura.");
                }
                break;

            case 2:
                System.out.println("Entras a la cueva... escuchas un rugido profundo.");
                System.out.print("¿Investigar (I) o Salir (S)? ");
                accion = scanner.nextLine().trim().toUpperCase();

                if (!accion.isEmpty() && accion.charAt(0) == 'I') {
                    System.out.println("Descubres una cámara secreta con el orbe flotando en el aire.");
                    orbe = true;
                } else {
                    System.out.println("Sales corriendo de la cueva. Has perdido tu oportunidad.");
                }
                break;

            case 3:
                System.out.println("El pueblo está desierto, pero ves una luz en la iglesia.");
                System.out.print("¿Entrar (E) o Ignorar (I)? ");
                accion = scanner.nextLine().trim().toUpperCase();

                if (!accion.isEmpty() && accion.charAt(0) == 'E') {
                    System.out.println("Dentro encuentras un altar y el orbe descansando sobre él.");
                    orbe = true;
                } else {
                    System.out.println("Te alejas del pueblo... y desapareces en la niebla.");
                }
                break;
        }

        return orbe;
    }

}



