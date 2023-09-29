import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner horaInput = new Scanner(System.in);
        System.out.println("Introduzca hora");
        int hora = parseInt(horaInput.nextLine());
        horaInput = new Scanner(System.in);
        System.out.println("Introduzca minutos");
        int minutos = parseInt(horaInput.nextLine());
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Hora invalida");
        }
        else {
            System.out.println("Faltan " + Math.abs((24-hora)*3600-(3600-(60-minutos)*60)) + " segundos");
        }
    }
}