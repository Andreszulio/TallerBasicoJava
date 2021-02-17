package Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args)  {
        double Iva = 0.21;
        double Valor;
        double ValorFinal;
        Scanner reader = new Scanner (System.in);
        System.out.println ("Introduzca el Valor del producto:");
        Valor = reader.nextDouble();
        ValorFinal = (Valor * Iva) + Valor;
        System.out.println("El Valor final incluyendo el IVA es: ["+ValorFinal+"]");
    }
}
