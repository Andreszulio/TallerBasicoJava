package Ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args)  {
        System.out.println("Ingresa el radio del circulo: ");
        Scanner reader=new Scanner(System.in);
        double radioCirculo=Double.parseDouble(reader.nextLine());
        double areaCirculo= Math.PI * Math.pow(radioCirculo,2);
        System.out.println("El radio del circulo es: "+radioCirculo+"y su área es: "+areaCirculo);
    }
}

