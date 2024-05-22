package Controller;
public class Empresa {
    public String nombre;
    public Persona personasArray[];
    public Terreno terrenosArray[];

    public Empresa(String nombre, Persona[] personasArray, Terreno[] terrenosArray) {
        this.nombre = nombre;
        this.personasArray = personasArray;
        this.terrenosArray = terrenosArray;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", personasArray=" + personasArray + ", terrenosArray=" + terrenosArray + '}';
    }
    
}
