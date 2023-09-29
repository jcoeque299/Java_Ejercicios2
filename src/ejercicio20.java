import java.util.Scanner;

public class ejercicio20 {
    public ejercicio20() {
    }
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        String num = lectura.next();
        if (num.length() <= 5) {
            String first_half = num.substring(0, num.length() / 2);
            String second_half = reverseString(num.substring(num.length() / 2));
            if (second_half.length() % 2 != 0) {
                second_half = second_half.substring(0, second_half.length() - 1);
            }

            if (first_half.equals(second_half)) {
                System.out.println(num + " es un numero capicua.");
            } else {
                System.out.println(num + " no es un numero capicua.");
            }
        } else {
            System.out.println("No se permiten numeros de mas de 5 cifras.");
        }
    }
}
