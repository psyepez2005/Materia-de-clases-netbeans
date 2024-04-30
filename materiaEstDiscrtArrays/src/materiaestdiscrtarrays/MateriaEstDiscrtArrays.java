
package materiaestdiscrtarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MateriaEstDiscrtArrays {

    public static void main(String[] args) {
        
        int a[] = new int[10];
        
        /*//////////////////////
        Scanner put = new Scanner(System.in); //esto no lo uso xq es para llenar por consola, en vez de eso uso la funcion llenar
        for (int i = 0; i < 10; i++) {
            a[i]=put.nextInt();
        }
        ////////////////////////*/
        
        llenar(a);
        System.out.println(presentar(a));

        ///////////////////////
        
        int numBuscar=7;
        System.out.println(buscar(a,numBuscar));
        
        /*//////////////////////
        
        int indiceElim=buscar(a,numBuscar);
        eliminar( a,  indiceElim);
        System.out.println(presentar(a));
        
        //////////////////////*//*

        ordenar(a);
        System.out.println(presentar(a));
        
        //////////////////////*/
        
    }
    public static String buscar(int a[], int numBuscar){
        //int b[] = new int[a.length];
        //int k=0;
        String y="";
        /*
        for (int i = 0; i < b.length; i++) {
            b[i]=0;
        }
        */
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==numBuscar){
                y+=i;
                /*
                b[k]=i;
                k++;
                */
                /*
                if(i == a.length){
                    return y;
                }
                */
                return y;
                
            }
            
        }
        /*
        for (int i = 0; i < b.length; i++) {
            b[i]=-1;
        }
        */
        return "-1";
    }
    public static void eliminar(int a[], int indiceElim){
        
        if(indiceElim!=-1){
            for (int i = indiceElim; i < a.length-1; i++) {
                a[i]=a[i+1];
            }
            a[a.length-1]=0;
        }
    }
    public static int[] ordenar(int a[]){
        int aux;
        int aOrdenado[];
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < 10; j++) {
                if(a[j]>a[j+1]){
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
        aOrdenado=a;
        return aOrdenado;
    }
    /*
    -
    -
    -
    -
    -
    -
    -
    -
    
    -
    */
    public static void llenar(int a[]){
        for (int i = 0; i < 10; i++) {
            int random=(int)(Math.random()*(0-10)+10);
            a[i]=random;
        }
    }
    public static String presentar(int a[]){
        String array="\n================\n";
        for (int i = 0; i < 10; i++) {
            array+=(a[i]+" - ");
        }
        array+="\n================\n";
        return array;
    }
    
}
