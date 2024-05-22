package matricesmultid;

import java.util.Scanner;

public class MatricesMultid {

    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        System.out.println("Afilas");
        int filas = put.nextInt();
        System.out.println("Acolumnas");
        int columnas = put.nextInt();
        int mat[][] = new int[filas][columnas];
        llenarMat(put, mat);
        System.out.println("Matriz");
        System.out.println(presentarMat(mat));
        System.out.println("La suma de los elementos de la matriz es: "+sumarMat(mat));
        ordenarFilas(mat,filas,columnas);
        System.out.println("Filas ordenadas de mayor a menor");
        System.out.println(presentarMat(mat));
        sumarColumnas(mat, filas, columnas);
        System.out.println("La suma de las columnas son");
        int sumaCol[] = sumarColumnas(mat,filas,columnas);
        for (int i = 0; i < sumaCol.length; i++) {
            System.out.print(sumaCol[i]+"  ");
        }
        System.out.println("\nLos numeros mayors de cada columna son");
        int numMayor[]=numMayor( mat,  filas,  columnas);
        for (int i = 0; i < numMayor.length; i++) {
            System.out.print(numMayor[i]+"  ");
        }
    }   
    public static int[] numMayor(int mat[][], int filas, int columnas){
        int numMayor[] = new int [columnas];
        int mayor;
        for (int i = 0; i < columnas; i++) {
            mayor=0;
            for (int j = 0; j < filas; j++) {
                if(mat[j][i]>mayor){
                    mayor=mat[j][i];
                    numMayor[i]=mayor;
                }
            }
            
        }
        return numMayor;
    }
    public static int[] sumarColumnas(int mat[][], int filas, int columnas){
        int sumaCol[] = new int [columnas];
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                sumaCol[i]+=mat[j][i];
            }       
        }
        return sumaCol;
    }
    public static void ordenarFilas(int mat[][], int filas, int columnas){
        int aux;
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas-1; j++) {
                for (int k = 0; k < (filas-1-j); k++) {
                    if(mat[i][k]<mat[i][k+1]){
                        aux=mat[i][k];
                        mat[i][k]=mat[i][k+1];
                        mat[i][k+1]=aux;
                    }
                }
            }
        }
    }
    public static int sumarMat(int mat[][]){
        int suma=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                suma+=mat[i][j];
            }
        }
    return suma;
    }

    

    public static void llenarMat(Scanner put, int mat[][]) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println("Fila: " + (i + 1) + " Columna: " + (j + 1));
                mat[i][j] = put.nextInt();
            }
        }

    }

    public static String presentarMat(int mat[][]) {
        String matriz = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                matriz += mat[i][j] + "  ";
            }
            matriz += "\n";
        }
        return matriz;
    }

}
