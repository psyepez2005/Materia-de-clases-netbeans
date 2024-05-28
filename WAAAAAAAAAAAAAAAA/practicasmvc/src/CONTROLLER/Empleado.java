package CONTROLLER;

public class Empleado {

    public String titulo;
    public int edad;
    public int exp;
    public int numEstrellas;

    public Empleado(String titulo, int edad, int exp) {
        this.titulo = titulo;
        this.edad = edad;
        this.exp = exp;
    }

    public void calcularNumEstrellas(String[] carrerasDemandadas) {
        for (String carrera : carrerasDemandadas) {
            if (titulo.equalsIgnoreCase(carrera)) {
                numEstrellas += 1;
                break;
            }
        }
        if ((edad > 18 && edad <= 30) && (exp > 6)) {
            numEstrellas += 1;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "titulo=" + titulo + ", edad=" + edad + ", exp=" + exp + ", numEstrellas=" + numEstrellas + '}';
    }

}
