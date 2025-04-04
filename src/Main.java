import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String saludo = """
                 Bienvenidos a mi primera practica
                CONVERSOR GRADOS CELCIUS A FARENHEIT
                """;

        System.out.println(saludo);

        Scanner scanner = new Scanner(System.in); // Creamos el scanner
        String respuesta;

        System.out.println("Desea continuar? (Y o N):");
        respuesta = scanner.nextLine().trim().toUpperCase();

        if (respuesta.equals("Y")) {
            System.out.println("introduce lo grados celcius: ");
            double celsius = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer después de nextInt()

            // Conversión de Celsius a Fahrenheit
            double fahrenheit = (celsius * 1.8) + 32;

            System.out.println("Los " + celsius + "°C equivalen a " + fahrenheit + "°F.");


        } else if (respuesta.equals("N")) {
            System.out.println("Has elegido salir. ¡Hasta la próxima!");
        } else {
            System.out.println("Respuesta no válida. Usa (Y) parea si o (N) para noy.");
        }
        scanner.close(); // Cerramos el scanner

        }
    }
