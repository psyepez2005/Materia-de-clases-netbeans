package poo1;
public class POO1 {
    public static void main(String[] args) {
        
        Vehiculo vehiculo=new Vehiculo("rojo", 120, 4, 2);
        vehiculo.cambiarMarcha();
        
        int llanta=2;
        vehiculo.validarVehiculo(llanta);
        
        //System.out.println("el color es"+vehiculo.color); // no funciona xq es privada
        
        //============================================================================
    
        Conductor conductor=new Conductor("Pepe", 'C', 1999);
        String tipoVehiculo="carro";
        conductor.validaLicencia("carro");
        conductor.validarEdad();

    }
    
}
