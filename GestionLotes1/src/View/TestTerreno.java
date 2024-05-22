package View;
import Controller.Terreno;
import Controller.Persona;
import java.util.Scanner;
import Controller.Empresa;
public class TestTerreno {
    public static void main(String[] args) {
        Persona personasArray[] = {new Persona("Gerente","JuanD"),new Persona("Cliente","Suanny")};
        Terreno terrenosArray[] = {new Terreno(10,5,2),new Terreno(4,5,6)};
        Empresa emp1 = new Empresa("MI LOTE-",personasArray,terrenosArray);
        for(Persona pers:personasArray){
            
            System.out.println(pers);
        }
        for(Terreno terr:terrenosArray){
            terr.calcularArea();
            terr.calcularPrecio();
            System.out.println(terr);
        }
        
    }

}
