package Ejercicios;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)");
        Date fecha = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: "+hourFormat.format(fecha));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha: "+dateFormat.format(fecha));
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+hourdateFormat.format(fecha));
    }
}
