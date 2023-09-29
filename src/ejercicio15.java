import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner caracterInput = new Scanner(System.in);
        System.out.println("Introduzca caracter");
        String caracter = caracterInput.nextLine();
        Scanner ladoInput = new Scanner(System.in);
        System.out.println("Introduzca hacia que direccion quiere que este apuntando el vertice (arriba, abajo, izquierda, derecha)");
        String lado = caracterInput.nextLine().toLowerCase();
        if (caracter.length() != 1 || (!lado.equals("arriba") && !lado.equals("abajo")) && !lado.equals("derecha") && !lado.equals("izquierda")) {
            System.out.println("Formato incorrecto. Introduzca un solo caracter y un lado correcto para el vertice");
        }
        else {
            switch (lado) {
                case "arriba":
                    System.out.println("     ^" );
                    break;
                case "abajo":
                    System.out.println("     v"  );
                    break;
                case "izquierda":
                    System.out.println("     <");
                    break;
                case "derecha":
                    System.out.println("     >");
                    break;
            }
            int spaces = 4;
            for (int cont = 3; cont<=9; cont = cont+2) {
                System.out.println(" ".repeat(spaces) + caracter.repeat(cont));
                spaces = spaces-1;
            }
        }
    }
}
