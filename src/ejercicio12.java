import java.util.Scanner;

public class ejercicio12 {
    public ejercicio12() {
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int contador = 0;
        System.out.println("CUESTIOANRIO");
        System.out.println("\n1. JavaScript es un lenguaje de entorno cliente.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta1 = Integer.parseInt(lectura.next());
        if (respuesta1 == 1) {
            ++contador;
        }

        System.out.println("\n2. La sintaxis de Java es mas simple que la de Kotlin.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta2 = Integer.parseInt(lectura.next());
        if (respuesta2 == 0) {
            ++contador;
        }

        System.out.println("\n3. Steve Jobs es un empresario de tipo innovador.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta3 = Integer.parseInt(lectura.next());
        if (respuesta3 == 1) {
            ++contador;
        }

        System.out.println("\n4. SASS no admite la sintaxis de CSS.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta4 = Integer.parseInt(lectura.next());
        if (respuesta4 == 0) {
            ++contador;
        }

        System.out.println("\n5. No es posible desplegar paginas web en Docker.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta5 = Integer.parseInt(lectura.next());
        if (respuesta5 == 0) {
            ++contador;
        }

        System.out.println("\n6. Para declarar uan constante en javaScript se usa \"cons\".");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta6 = Integer.parseInt(lectura.next());
        if (respuesta6 == 1) {
            ++contador;
        }

        System.out.println("\n7. La abreviatura de \"System.out.println\" es \"souf\"");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta7 = Integer.parseInt(lectura.next());
        if (respuesta7 == 0) {
            ++contador;
        }

        System.out.println("\n8. Un emprendedor es un persona con capacidad de convertir una idea en proyecto real innovando el entorno.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta8 = Integer.parseInt(lectura.next());
        if (respuesta8 == 1) {
            ++contador;
        }

        System.out.println("\n9. Es recomendable diseñar tu pagina web en una aplicacion como figma antes de empezar a maquetar.");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta9 = Integer.parseInt(lectura.next());
        if (respuesta9 == 1) {
            ++contador;
        }

        System.out.println("\n10. Para que un dominio sea seguro ha de ser http");
        System.out.println("Verdadero (1) o Falso (0): ");
        int respuesta10 = Integer.parseInt(lectura.next());
        if (respuesta10 == 0) {
            ++contador;
        }

        System.out.println("\nTOTAL: " + contador + " puntos.");
    }
}