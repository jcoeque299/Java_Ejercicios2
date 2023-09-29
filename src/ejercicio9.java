import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca valor de ax^2 (sin incluir la x ni la elevacion a 2)");
        double parametroA = parseDouble(userInput.nextLine());
        userInput = new Scanner(System.in);
        System.out.println("Introduzca valor de bx (sin incluir la x)");
        double parametroB = parseDouble(userInput.nextLine());
        userInput = new Scanner(System.in);
        System.out.println("Introduzca valor de c");
        double parametroC = parseDouble(userInput.nextLine());
        System.out.println("El resultado es " + ((-parametroB) + Math.sqrt(Math.pow(parametroB, 2) - (4 * parametroA * parametroC))) / (2 * parametroA) + " y " + ((-parametroB) - Math.sqrt(Math.pow(parametroB, 2) - (4 * parametroA * parametroC))) / (2 * parametroA));
    }
}
