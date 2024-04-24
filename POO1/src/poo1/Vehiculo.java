package poo1;
public class Vehiculo {
    String color;
    int velocidad;
    int traccion;
    
    public Vehiculo (String color, int velocidad, int traccion, int llantas){
        this.color=color;
        this.velocidad=velocidad;
        this.traccion=traccion;
        System.out.println( "El color es: "+color+"\nLa velocidad es: "+velocidad+"\nLa traccion es: "+traccion);
    }
    public void subirVelocidad(){
        System.out.println("Subir velocidad");
    }
    public void bajarVelocidad(){
        System.out.println("Bajar velocidad");
    }
    public void cambiarMarcha(){
        System.out.println("Cambiar marcha");
    }
    public void validarVehiculo(int llantas){
        if(llantas==2){
            System.out.println("moto");
        }
        else{
            System.out.println("carro");
        
        }
    }
}
