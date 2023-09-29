import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner numeroInput = new Scanner(System.in);
        System.out.println("Introduzca numero");
        Integer numero = parseInt(numeroInput.nextLine());
        if (numero > 99999 || numero < -99999) {
            System.out.println("Solo numeros de hasta 5 digitos");
        }
        else {
            System.out.println(numero.toString().replace("-","").length());
        }
    }
}
