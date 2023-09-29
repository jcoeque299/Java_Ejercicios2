import java.util.Scanner;

public class ejercicio14 {
    public ejercicio14() {
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        float num = Float.parseFloat(lectura.next());
        if (num % 2.0F == 0.0F) {
            System.out.println("El " + num + " es par.");
        } else {
            System.out.println("El " + num + " es impar.");
        }

        if (num % 5.0F == 0.0F) {
            System.out.println("El " + num + " es multiplo de 5.");
        } else {
            System.out.println("El " + num + " no es multiplo de 5.");
        }
    }
}