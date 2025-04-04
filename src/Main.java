import java.util.Scanner; //Para leer datos del usuario.

public class Main {
    public static void main(String[] args) {
        String saludo = """
                 Bienvenidos a mi primera practica
                CONVERSOR GRADOS CELCIUS A FARENHEIT
                """;

        System.out.println(saludo);

        Scanner scanner = new Scanner(System.in); // nos preparamos a leer datos del teclado con System.in
        String respuesta;

        System.out.println("Desea continuar? (Y o N):");
        respuesta = scanner.nextLine().trim().toUpperCase();

        if (respuesta.equals("Y")) {
            System.out.println("Introduce los grados Celsius: ");
            double celsius = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer después de nextDouble()

            // Conversión de Celsius a Fahrenheit
            double fahrenheit = (celsius * 1.8) + 32;

            // Usamos printf para dar formato a los dsatos
            System.out.printf("Los %.2f°C equivalen a %.2f°F.%n", celsius, fahrenheit);


        } else if (respuesta.equals("N")) {
            System.out.println("Has elegido salir. ¡Hasta la próxima!");
        } else {
            System.out.println("Respuesta no válida. Usa (Y) para si o (N) para no.");
        }
        scanner.close(); // Cerramos el scanner

        }
    }
