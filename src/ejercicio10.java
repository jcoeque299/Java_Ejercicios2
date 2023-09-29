import java.util.Scanner;

public class ejercicio10 {
    public ejercicio10() {
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca su dia de nacimiento: ");
        float dia = Float.parseFloat(lectura.next());
        System.out.println("Introduzca su mes de nacimiento: ");
        float mes = Float.parseFloat(lectura.next());
        String horoscopo = "";
        switch ((int)mes) {
            case 1:
                if (!(dia > 1.0F) && !(dia < 31.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 19.0F) {
                    horoscopo = "Capricornio";
                } else {
                    horoscopo = "Acuario";
                }
                break;
            case 2:
                if (!(dia > 1.0F) && !(dia < 28.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 18.0F) {
                    horoscopo = "Acuario";
                } else {
                    horoscopo = "Piscis";
                }
                break;
            case 3:
                if (!(dia > 1.0F) && !(dia < 31.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 20.0F) {
                    horoscopo = "Piscis";
                } else {
                    horoscopo = "Aries";
                }
                break;
            case 4:
                if (!(dia > 1.0F) && !(dia < 30.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 19.0F) {
                    horoscopo = "Aries";
                } else {
                    horoscopo = "Tauro";
                }
                break;
            case 5:
                if (!(dia > 1.0F) && !(dia < 31.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 20.0F) {
                    horoscopo = "Tauro";
                } else {
                    horoscopo = "Geminis";
                }
                break;
            case 6:
                if (!(dia > 1.0F) && !(dia < 30.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 20.0F) {
                    horoscopo = "Geminis";
                } else {
                    horoscopo = "Cancer";
                }
                break;
            case 7:
                if (!(dia > 1.0F) && !(dia < 31.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 22.0F) {
                    horoscopo = "Cancer";
                } else {
                    horoscopo = "Leo";
                }
                break;
            case 8:
                if (!(dia > 1.0F) && !(dia < 31.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 22.0F) {
                    horoscopo = "Leo";
                } else {
                    horoscopo = "Virgo";
                }
                break;
            case 9:
                if (!(dia > 1.0F) && !(dia < 30.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 22.0F) {
                    horoscopo = "Virgo";
                } else {
                    horoscopo = "Libra";
                }
                break;
            case 10:
                if (!(dia > 1.0F) && !(dia < 31.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 22.0F) {
                    horoscopo = "Libra";
                } else {
                    horoscopo = "Escorpio";
                }
                break;
            case 11:
                if (!(dia > 1.0F) && !(dia < 30.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 21.0F) {
                    horoscopo = "Escorpio";
                } else {
                    horoscopo = "Sagitario";
                }
                break;
            case 12:
                if (!(dia > 1.0F) && !(dia < 31.0F)) {
                    System.out.println("El dia es incorrecto");
                } else if (dia < 18.0F) {
                    horoscopo = "Sagitario";
                } else {
                    horoscopo = "Capricornio";
                }
        }

        System.out.println("Su horoscopo es " + horoscopo);
    }
}