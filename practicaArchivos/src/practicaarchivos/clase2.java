
package practicaarchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class clase2 {     ///   CLASES FileInputStream,FileOutputStream
    public static void main(String[] args) {
        try {
            File wow = new File("C:\\\\Users\\\\utpl\\\\Desktop\\\\clase2.txt");
            if (wow.createNewFile()) {
                System.out.println("Archivo creado: " + wow.getName());
                System.out.println("Ubicado en: " + wow.getPath());
            }
            else{
                System.out.println("El archivo ya existe");
                System.out.println("Ubicado en: " + wow.getPath());
            }
            FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\utpl\\\\Desktop\\\\clase2.txt",true);
            String texto = "hola xavales, que tal estais\n";
            byte tex[]=texto.getBytes();
            fos.write(tex);
            
            fos.close();
            System.out.println("Se ha escrito el archivo");
            System.out.println("---------------------------");
            FileInputStream fis = new FileInputStream("C:\\\\Users\\\\utpl\\\\Desktop\\\\clase2.txt");
            int i;
                    while((i=fis.read())!= -1)
                        System.out.print((char)i);
        } catch (IOException e) {
            System.out.println("Errorjsjsjsjs");
        }
    }
}
