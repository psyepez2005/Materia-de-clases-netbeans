package taller3.problema7;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        System.out.println("Ingrese la cedula del dueno");
        String cedula = put.next();
        System.out.println("Ingrese la marca del vehiculo");
        String marca = put.next();
        System.out.println("Ingrese el ano de fabricacion");
        int ano = put.nextInt();
        System.out.println("Ingrese el valor del vehiculo");
        double valorVehic = put.nextDouble();
        Automotor automotor=new Automotor(cedula,marca,ano,valorVehic,0);
        
    }
}
