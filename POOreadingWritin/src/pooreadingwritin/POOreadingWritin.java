package pooreadingwritin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Formatter;
import java.util.Scanner;

public class POOreadingWritin {

    public static void main(String[] args) {
        //flujo de salida
        try {
            System.out.println("WAAAAAAAAA");
            Scanner put = new Scanner(System.in);
            String mensaje = put.next();
            Formatter escritor = new Formatter("baits.txt");
            escritor.format("%s %s", "buenasssss",mensaje);
            escritor.close();
            Saludo obj1Sal = new Saludo("Saludos Out - obj1");
            ObjectOutputStream obOUTs3=new ObjectOutputStream(new FileOutputStream("ArchivoSaludo.dat"));
            obOUTs3.writeObject(obj1Sal);
            obOUTs3.close();
            System.out.println("Flujos de salida");
            System.out.println(put.nextLine());
            System.out.println(new Scanner(new File("Clase1.txt")).nextLine());
        } catch (Exception e) {
        }

    }

}
class Saludo implements Serializable{
    public String saludos;

    public Saludo(String saludos) {
        this.saludos = saludos;
    }

    @Override
    public String toString() {
        return "Saludo{" + "saludos=" + saludos + '}';
    }
    
}