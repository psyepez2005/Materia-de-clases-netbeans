package tallergrupalpilasycolas1;
// Emilio Peña - Jean Cuenca - Pedro Yépez

import java.util.Scanner;

public class TallerGrupalPIlasyColas1 {

    public static void main(String[] args) {
        Cola_SRI sri = new Cola_SRI();
        Scanner put = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("QUE DESEA HACER??");
            System.out.println("1- Agregar");
            System.out.println("2- Atender");
            System.out.println("3- Sacar del medio");
            System.out.println("4- Imprimir");
            System.out.println("5- Salir");
            int resp = put.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Ingrese la ced del nuevo cliente");
                    int ced = put.nextInt();
                    sri.insert(sri, ced);
                    break;
                case 2: 
                    sri.atender(sri);
                    break;
                case 3:
                    System.out.println("Ingrese el numero");
                    int key = put.nextInt();
                    sri.delete(sri, key);
                    break;
                case 4:
                    sri.print(sri);
                    break;
                case 5:
                    seguir = false;
                    break;
            }
        }
    }

}
