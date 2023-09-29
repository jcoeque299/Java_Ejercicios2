import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner notaInput = new Scanner(System.in);
        System.out.println("Introduzca primera nota");
        double nota1 = parseDouble(notaInput.nextLine());
        notaInput = new Scanner(System.in);
        System.out.println("Introduzca segunda nota");
        double nota2 = parseDouble(notaInput.nextLine());
        Scanner diaInput = new Scanner(System.in);
        System.out.println("Introduzca tercera nota");
        double nota3 = parseDouble(notaInput.nextLine());
        System.out.println((nota1+nota2+nota3)/3);
    }
}
