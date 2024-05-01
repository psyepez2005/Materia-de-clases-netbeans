package TestPersona;

public class TestPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Pepe", 20);
        System.out.println(p1.getEdad());
        System.out.println(p1.getNOmb());
        System.out.println(p2.getEdad());
        System.out.println(p2.getNOmb());
        System.out.println(p3.getEdad());
        System.out.println(p3.getNOmb());
    }

}

class Persona {

    public String nomb;
    private int edad;
    
    public Persona(){
    
    }
    public Persona(String nomb){
        this.nomb=nomb;
        
    }
    
    public Persona(String nomb, int edad){
        this.nomb=nomb;
        this.edad=edad;
    }
    
    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int calcularEdad(int anioNac) {
        return 2024 - anioNac;
    }

    public String getNOmb() {
        return this.nomb;
    }

    public int getEdad() {
        return this.edad;
    }
    @Override
    public String toString(){
        return"";
    }
}
