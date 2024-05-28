package MODEL;

import CONTROLLER.Empleado;
import java.io.FileInputStream;

import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LeerEmpleado {
    ObjectInputStream flujoSalida;
    FileInputStream path;
    ArrayList<Empleado> listaEmpleados;

    public LeerEmpleado(FileInputStream path) {
        this.path = path;
    }
    
}
