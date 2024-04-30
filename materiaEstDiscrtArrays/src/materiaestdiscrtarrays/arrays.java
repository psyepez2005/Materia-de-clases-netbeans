package materiaestdiscrtarrays;
public class arrays {
    public static void main(String[] args) {
        int a[] = new int[5];
        llenar(a);
        System.out.println(presentar(a));
        int insertar = 99;
        int indice = 4;
        insertar(a,insertar,indice);
        System.out.println("/////////////////////////");
        System.out.println(presentar(a));
    }
    public static void insertar(int a[], int insertar, int indice){
        
        if(indice!=-1){
            for (int i = 1; i < (a.length-indice); i++) {
                a[a.length-i]=a[a.length-i-1];
            }
            
        }
        a[indice]=insertar;

    }
    public static void llenar(int a[]){
        for (int i = 0; i < a.length; i++) {
            int random=(int)(Math.random()*(0-10)+10);
            a[i]=random;
        }
    }
    public static String presentar(int a[]){
        String array="\n================\n";
        for (int i = 0; i < a.length; i++) {
            array+=(a[i]+" - ");
        }
        array+="\n================\n";
        return array;
    }
}