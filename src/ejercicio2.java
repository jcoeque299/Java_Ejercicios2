import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba una hora (0-24): ");
        float hora = Float.parseFloat(lectura.next());
        if (!(hora > 24.0F) && !(hora < 0.0F)) {
            if (hora >= 6.0F && hora <= 12.0F) {
                System.out.println("Buenos días!");
            } else if (hora >= 13.0F && hora <= 20.0F) {
                System.out.println("Buenas tardes!");
            } else if (hora >= 21.0F || hora <= 5.0F) {
                System.out.println("Buenas noches!");
            }
        } else {
            System.out.println("La hora no es correcta");
        }
    }
}
