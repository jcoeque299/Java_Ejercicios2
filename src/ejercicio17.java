import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner numeroInput = new Scanner(System.in);
        System.out.println("Introduzca numero");
        String numero = numeroInput.nextLine();
        System.out.println(numero.charAt(numero.length()-1));
    }
}
