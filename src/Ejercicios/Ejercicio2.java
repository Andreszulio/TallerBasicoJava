package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main( String[] args ) {
        int x;
        int y;
        Scanner reader = new Scanner (System.in);
        System.out.println ("Introduzca el primer numero:");
        x = reader.nextInt();
        System.out.println ("Introduzca el segundo numero:");
        y = reader.nextInt();
        if(x>=y){
            System.out.println("X es mayor o igual que Y");
        }
        else{
            System.out.println("X es menor o igual que Y");
        }
    }
}
