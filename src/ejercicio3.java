import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner diaInput = new Scanner(System.in);
        System.out.println("Introduzca numero del dia de la semana");
        int dia = parseInt(diaInput.nextLine());
        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Ese dia no existe");
                break;
        }
    }
}