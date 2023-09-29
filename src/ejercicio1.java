import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner diaInput = new Scanner(System.in);
        System.out.println("Introduzca dia de la semana");
        String dia = diaInput.nextLine();
        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("DWES");
                break;
            case "martes":
                System.out.println("EIE");
                break;
            case "miercoles":
                System.out.println("DWEC");
                break;
            case "jueves":
                System.out.println("DWEC");
                break;
            case "viernes":
                System.out.println("DWES");
                break;
            default:
                System.out.println("Ese dia no existe o es fin de semana");
                break;
        }
    }
}
