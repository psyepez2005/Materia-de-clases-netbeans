package CONTROLLER;

import java.util.ArrayList;

public class Empresa {

    public ArrayList<Empleado> listaEmpleados;

    public Empresa(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    public void asignarEstrellas(String[] carrerasDemandadas){
        for (Empleado emp : listaEmpleados) {
            emp.calcularNumEstrellas(carrerasDemandadas);
        }
    }
    @Override
    public String toString() {
        return "Empresa{" + "listaEmpleados=" + listaEmpleados + '}';
    }

}
