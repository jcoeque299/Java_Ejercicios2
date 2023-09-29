import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca valor de ax (sin incluir la x)");
        double parametroA = parseDouble(userInput.nextLine());
        userInput = new Scanner(System.in);
        System.out.println("Introduzca valor de b");
        double parametroB = parseDouble(userInput.nextLine());
        System.out.println("El resultado es " + -parametroB/parametroA);
    }
}
