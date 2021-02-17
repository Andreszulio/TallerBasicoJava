package Ejercicios;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        String dia;
        Scanner reader = new Scanner (System.in);
        System.out.println ("Introducir numero");
        dia = reader.nextLine();
        switch(dia){
            case "Lunes":
                System.out.println("El "+dia+" es un día laboral");
                break;
            case "Martes":
                System.out.println("El "+dia+" es un día laboral");
                break;
            case "Miercoles":
                System.out.println("El "+dia+" es un día laboral");
                break;
            case "Jueves":
                System.out.println("El "+dia+" es un día laboral");
                break;
            case "Viernes":
                System.out.println("El "+dia+" es un día laboral");
                break;
            case "Sabado":
                System.out.println("El "+dia+" es un día laboral");
                break;
            case "Domingo":
                System.out.println("El "+dia+" no es un día laboral, es día de descanso");
                break;
            default:
                System.out.println("Ingrese un día valido");
                break;
        }
    }
}
