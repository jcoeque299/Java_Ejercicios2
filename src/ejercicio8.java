import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner notaInput = new Scanner(System.in);
        System.out.println("Introduzca primera nota");
        double nota1 = parseDouble(notaInput.nextLine());
        System.out.println("Introduzca segunda nota");
        double nota2 = parseDouble(notaInput.nextLine());
        System.out.println("Introduzca tercera nota");
        double nota3 = parseDouble(notaInput.nextLine());

        double media = ((nota1+nota2+nota3)/3);

        if (media >= 0 && media <= 4) {
            System.out.println("Insuficiente: " + media);
        } else if (media == 5) {
            System.out.println("Suficiente: " + media);
        } else if (media >= 6 && media < 7) {
            System.out.println("Bien: " + media);
        } else if (media >=7 && media < 9) {
            System.out.println("Notable: " + media);
        } else if (media >= 9 && media <= 10) {
            System.out.println("Sobresaliente: " + media);
        } else {
            System.out.println("Las notas introducidas son incorrectas.");
        }
    }
}
