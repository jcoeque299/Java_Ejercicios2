import java.util.Scanner;

public class ejercicio4 {
    public ejercicio4() {
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas: ");
        float horas = Float.parseFloat(lectura.next());
        float h_extra;
        if (horas > 40.0F) {
            h_extra = horas - 40.0F;
            horas -= h_extra;
            float salario = horas * 12.0F;
            float s_extra = h_extra * 16.0F;
            float h_totales = horas + h_extra;
            float s_total = salario + s_extra;
            System.out.println("El salario que corresponde a las " + h_totales + " horas trabajadas es de " + s_total + " euros.");
        } else {
            h_extra = horas * 12.0F;
            System.out.println("El salario que corresponde a las " + horas + " horas trabajadas es de " + h_extra + " euros.");
        }

    }
}