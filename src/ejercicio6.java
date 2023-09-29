import java.util.Scanner;

public class ejercicio6 {
    public ejercicio6() {
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca la altura a la que esta el objeto: ");
        float altura = Float.parseFloat(lectura.next());
        float tiempo = (float)Math.sqrt((double)(2.0F * altura) / 9.81);
        System.out.println("Si el objeto esta a " + altura + " metros tardara en caer " + tiempo + " segundos.");
    }
}