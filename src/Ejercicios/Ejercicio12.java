package Ejercicios;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Escribe dos palabras");
        Scanner reader = new Scanner(System.in);
        String Frase1 = reader.nextLine();
        Scanner reader2 = new Scanner(System.in);
        String Frase2 = reader.nextLine();
        if (Frase1.equals(Frase2))
        {
            System.out.println("Las Palabras son iguales");
        }else
        {
            System.out.println("Escribiste: "+Frase2+", y la manera correcta era: "+Frase1);
        }
    }
}
