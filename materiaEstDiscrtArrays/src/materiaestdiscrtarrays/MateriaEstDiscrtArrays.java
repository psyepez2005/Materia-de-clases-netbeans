
package materiaestdiscrtarrays;

import java.util.Scanner;

public class MateriaEstDiscrtArrays {

    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        int a[] = new int[10];
        
        /*//////////////////////
        for (int i = 0; i < 10; i++) {
            a[i]=put.nextInt();
        }
        ////////////////////////*/
        
        llenar(a);
        
        
        System.out.println(presentar(a));

        ///////////////////////
        int numBuscar=7;
        System.out.println(buscar(a,numBuscar));
        
        
        int indiceElim=buscar(a,numBuscar);
        eliminar( a,  indiceElim);
        
        

        System.out.println(presentar(a));

        
    }
    public static int buscar(int a[], int numBuscar){
        int b[] = new int[a.length];
        for (int i = 0; i < 10; i++) {
            if(a[i]==numBuscar){
                
                return i;
            }
        }
        return -1;
    }
    public static void eliminar(int a[], int indiceElim){
        
        if(indiceElim!=-1){
            for (int i = indiceElim; i < a.length-1; i++) {
                a[i]=a[i+1];
            }
            a[a.length-1]=0;
        }
    }
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
