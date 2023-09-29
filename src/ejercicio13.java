import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner numeroInput = new Scanner(System.in);
        System.out.println("Introduzca primer numero");
        double numero1 = parseDouble(numeroInput.nextLine());
        numeroInput = new Scanner(System.in);
        System.out.println("Introduzca segundo numero");
        double numero2 = parseDouble(numeroInput.nextLine());
        Scanner diaInput = new Scanner(System.in);
        System.out.println("Introduzca tercer numero");
        double numero3 = parseDouble(numeroInput.nextLine());
        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);
        }
        else if (numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
            System.out.println(numero1 + ", " + numero3 + ", " + numero2);
        }
        else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
            System.out.println(numero2 + ", " + numero1 + ", " + numero3);
        }
        else if (numero2 > numero1 && numero2 > numero3 && numero1 < numero3) {
            System.out.println(numero2 + ", " + numero3 + ", " + numero1);
        }
        else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
            System.out.println(numero3 + ", " + numero1 + ", " + numero2);
        }
        else if (numero3 > numero1 && numero3 > numero2 && numero1 < numero2) {
            System.out.println(numero3 + ", " + numero2 + ", " + numero1);
        }
    }
}
