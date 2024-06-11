package nodospracticatosca;

import java.util.Scanner;

public class MainSinglyLikedList {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        Scanner put = new Scanner(System.in);

        while (true) {
            System.out.println("QUE DESEA HACER?");
            System.out.println("[1] Ingresar alumnos");
            System.out.println("[2] Eliminar alumnos");
            System.out.println("[3] Imprimir la lista");
            System.out.println("[4] Sacar el promedio de los estudiantes" );
            System.out.println("[5] Nada");
            int menu = put.nextInt();
            
            if (menu == 1) {
                System.out.println("Ingrese la ced del alumno");
                int ced = put.nextInt();
                System.out.println("Ingrese el nombre");
                String nombre = put.next();
                System.out.println("Ingrese el apellido");
                String apell = put.next();
                System.out.println("Ingrese la nota");
                double nota = put.nextDouble();
                list = list.insert(list, ced, nombre, apell, nota);
            }
            if (menu == 2){
                System.out.println("Ingrese la ced del alumno que desea eliminar");
                int cedElim = put.nextInt();
                list.delete(list, cedElim);
            }
            
            if (menu == 3){
            list.print(list);
            }
            if (menu == 4){
            list.promediar(list);
            }
            if (menu == 5){
                break;
            }
        }
        
    }

}
