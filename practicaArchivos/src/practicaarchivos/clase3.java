
package practicaarchivos;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class clase3 {

    public static void main(String[] args) {
        try {
            File wow = new File("C:\\\\Users\\\\utpl\\\\Desktop\\\\clase3.txt");
            if (wow.createNewFile()) {
                System.out.println("Archivo creado: " + wow.getName());
                System.out.println("Ubicado en: " + wow.getPath());
            } else {
                System.out.println("El archivo ya existe");
                System.out.println("Ubicado en: " + wow.getPath());
            }
            BufferedWriter bw= new BufferedWriter(new FileWriter("C:\\\\Users\\\\utpl\\\\Desktop\\\\clase3.txt",true));
            bw.write("buenas noches");
            
            for (int i = 0; i < 5; i++) {
                bw.append("hola"+i+"\n");
            }
            
            bw.close();
            System.out.println("Se ha escrito");
            System.out.println("-----------------------------");
            BufferedReader br= new BufferedReader(new FileReader("C:\\\\Users\\\\utpl\\\\Desktop\\\\clase3.txt"));
            String textito = br.readLine();
            while(textito==null){
                System.out.print(textito);
                textito=br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Errorjsjsjsjs");
        }
    }
}
