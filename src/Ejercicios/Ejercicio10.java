package Ejercicios;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingresa la frase para eliminar su espaciado");
        Scanner reader = new Scanner(System.in);
        String Frase = reader.nextLine();
        Frase = Frase.replace(" ","");
        System.out.println(Frase);
    }
}
