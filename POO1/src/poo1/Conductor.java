package poo1;
public class Conductor {
   private String nombre;
   char tipoLic;
   int anoNac;
   public Conductor(String nombre, char tipoLic, int anoNac){
       this.nombre=nombre;
       this.tipoLic=tipoLic;
       this.anoNac=anoNac;
   }
   public void validarEdad(){
       if(anoNac>2007)
           System.out.println("MENOR DE EDAD = MULTA");
       else
           System.out.println("MAYOR DE EDAD = NO MULTA");
   }
   public void validaLicencia(String tipoVehiculo){
       if((tipoLic=='C' && tipoVehiculo.equals("carro"))||(tipoLic=='E' && tipoVehiculo.equals("taxi"))||(tipoLic=='A' && tipoVehiculo.equals("moto")))
           System.out.println("LICENCIA ADECUADA = NO MULTA");
       
       else 
           System.out.println("LICENCIA INCORRECTA = MULTA");
   }
   
}

