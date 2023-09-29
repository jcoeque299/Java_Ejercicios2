import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner notaInput = new Scanner(System.in);
        System.out.println("Introduzca nota del primer examen");
        Double nota1 = parseDouble(notaInput.nextLine());
        notaInput = new Scanner(System.in);
        System.out.println("Introduzca nota del segundo examen");
        Double nota2 = parseDouble(notaInput.nextLine());
        if (nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 < 0) {
            System.out.println("Nota invalida");
        }
        else if ((nota1+nota2)/2 < 5) {
            Scanner aptoInput = new Scanner(System.in);
            System.out.println("Introduzca nota de la recuperacion (apto/no apto)");
            String apto = aptoInput.nextLine().toLowerCase();
            switch (apto) {
                case "apto":
                    System.out.println("La nota final es un 5");
                    break;
                case "no apto":
                    System.out.println("La nota final es un "+ (nota1+nota2)/2);
                    break;
                default:
                    System.out.println("Nota invalida");
            }
        }
        else {
            System.out.println("La nota final es un "+ (nota1+nota2)/2);
        }
    }
}
