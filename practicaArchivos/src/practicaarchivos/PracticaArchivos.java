package practicaarchivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticaArchivos {

    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("C:\\Users\\utpl\\Desktop\\escritor.txt",true);
            escritor.write("hola mundo de zorrso");

            for (int i = 0; i < 10; i++) {
                escritor.append("\nhola" + i);
            }

            escritor.close();

            System.out.println("El archivo ha sido modificado");
        } catch (IOException e) {
            System.out.println("ERROR ESCRITOR");
        }
        System.out.println("-------------");
        try {
            FileReader lector = new FileReader("C:\\Users\\utpl\\Desktop\\escritor.txt");
            int i;
            while ((i = lector.read()) != -1) {
                System.out.print((char)i);
                
            }
        } catch (IOException e) {
        }

        /*
        
        --------------------------------------------------------------
        try {
            File wow = new File("C:\\Users\\utpl\\Desktop\\escritorio.txt");
            if (wow.createNewFile()) {
                System.out.println("Archivo creado: " + wow.getName());
                System.out.println("Ubicado en: " + wow.getPath());
            }
            else{
                System.out.println("El archivo ya existe");
                System.out.println("Ubicado en: " + wow.getPath());
            }
        } catch (IOException e) {
            System.out.println("ERROR JSJS");
        }
         */
    }

}
