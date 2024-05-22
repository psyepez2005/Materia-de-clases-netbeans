package Controller;
public class Persona {
    public String rol;
    public String nombre;

    public Persona(String rol, String nombre) {
        this.rol = rol;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "rol=" + rol + ", nombre=" + nombre + '}';
    }
            
}
