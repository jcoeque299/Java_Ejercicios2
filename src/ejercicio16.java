import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int contador = 0;
        System.out.println("\n1. Pregunta 1.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta1 = Integer.parseInt(lectura.next());
        if (respuesta1 == 1) {
            contador = contador + 3;
        }

        System.out.println("\n2. Pregunta 2.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta2 = Integer.parseInt(lectura.next());
        if (respuesta2 == 1) {
            contador = contador + 3;
        }

        System.out.println("\n3. Pregunta 3.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta3 = Integer.parseInt(lectura.next());
        if (respuesta3 == 1) {
            contador = contador + 3;
        }

        System.out.println("\n4. Pregunta 4.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta4 = Integer.parseInt(lectura.next());
        if (respuesta4 == 1) {
            contador = contador + 3;
        }

        System.out.println("\n5. Pregunta 5.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta5 = Integer.parseInt(lectura.next());
        if (respuesta5 == 1) {
            contador = contador + 3;
        }

        if (contador >= 9) {
            System.out.println("\nTOTAL: " + contador + " puntos. Tu pareja es infiel.");
        } else {
            System.out.println("\nTOTAL: " + contador + " puntos. Tu pareja no es infiel.");
        }
    }
}