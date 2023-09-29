import java.util.Scanner;

public class ejercicio22 {
    public ejercicio22() {
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el dia: ");
        String dia = lectura.next();
        System.out.println("Introduzca la hora (HH.mm): ");
        String hora = lectura.next();
        int horas = Integer.parseInt(hora.substring(0, hora.indexOf(".")));
        int minutos = Integer.parseInt(hora.substring(hora.indexOf(".") + 1));
        int h_left;
        int min_left;
        switch (dia) {
            case "lunes":
                if (horas < 15) {
                    h_left = 14 - horas;
                    min_left = h_left * 60 + (60 - minutos) + 5760;
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                } else {
                    h_left = 24 - horas + 14;
                    min_left = h_left * 60 + (60 - minutos) + 4320;
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                }
                break;
            case "martes":
                if (horas < 15) {
                    h_left = 14 - horas;
                    min_left = h_left * 60 + (60 - minutos) + 4320;
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                } else {
                    h_left = 24 - horas + 14;
                    min_left = h_left * 60 + (60 - minutos) + 2880;
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                }
                break;
            case "miercoles":
                if (horas < 15) {
                    h_left = 14 - horas;
                    min_left = h_left * 60 + (60 - minutos) + 2880;
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                } else {
                    h_left = 24 - horas + 14;
                    min_left = h_left * 60 + (60 - minutos) + 1440;
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                }
                break;
            case "jueves":
                if (horas < 15) {
                    h_left = 14 - horas;
                    min_left = h_left * 60 + (60 - minutos) + 1440;
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                } else {
                    h_left = 24 - horas + 14;
                    min_left = h_left * 60 + (60 - minutos);
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                }
                break;
            case "viernes":
                if (horas < 15) {
                    h_left = 14 - horas;
                    min_left = h_left * 60 + (60 - minutos);
                    System.out.println("Faltan " + min_left + " minutos para el fin de semana.");
                } else {
                    System.out.println("Ya estamos en fin de semana.");
                }
        }
    }
}