package Ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int Numero;
        Scanner reader = new Scanner (System.in);
        do{
            System.out.println ("Introducir numero otra vez:");
            Numero = reader.nextInt();
        }while(Numero<0);
        System.out.println("El número que rompió el ciclo es: "+Numero+" porque es mayor o igual a cero");
    }
}
