package practicaarchivos;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Act_en_clase1 {
    public static void main(String[] args) {
        try {
            Scanner put = new Scanner(System.in);
            File actClase1 = new File("C:\\\\Users\\\\utpl\\\\Desktop\\\\actClase1.txt");
            if (actClase1.createNewFile()) {
                System.out.println("Archivo creado: " + actClase1.getName());
                System.out.println("Ubicado en: " + actClase1.getPath());
            } else {
                System.out.println("El archivo ya existe");
                System.out.println("Ubicado en: " + actClase1.getPath());
            }
            FileWriter fw = new FileWriter("C:\\\\Users\\\\utpl\\\\Desktop\\\\actClase1.txt",true);
            for (int i = 0; i < 5; i++) {
                System.out.println("Introduzca el nombre "+(i+1));
                String nombres = put.next();
                fw.write("Nombre"+(i+1)+": "+nombres+"  -  ");
                System.out.println("Introduzca la edad "+(i+1));
                String edades = put.next();
                fw.write("Edad"+(i+1)+": "+edades+"\n");
            }
            fw.close();
        } catch (IOException e) {
        }
        
        
    }
}
