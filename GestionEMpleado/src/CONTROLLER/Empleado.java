package CONTROLLER;

import java.io.Serializable;

public class Empleado implements Serializable{
    public String nombre;
    public double sueldo;
    public int edad;

    public Empleado(String nombre, double sueldo, int edad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", edad=" + edad + '}';
    }
    
}
