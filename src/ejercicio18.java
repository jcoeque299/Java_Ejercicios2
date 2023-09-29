import java.util.Scanner;

public class ejercicio18 {
    public ejercicio18() {
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        String num = lectura.next();
        if (num.length() <= 5) {
            String[] chr = num.split("");
            String cifra1 = chr[0];
            System.out.println("La primera cifra de " + num + " es " + cifra1);
        } else {
            System.out.println("No se permiten numeros de mas de 5 cifras.");
        }
    }
}