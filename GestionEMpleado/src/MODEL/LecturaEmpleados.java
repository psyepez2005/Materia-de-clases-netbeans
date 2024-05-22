package MODEL;

import CONTROLLER.Empleado;
import java.io.EOFException;
import java.io.FileInputStream;

import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaEmpleados {
    public ArrayList<Empleado> listaEmpleados;
    public ObjectInputStream flujoEntradaEmp;
    public FileInputStream pathArch;

    public LecturaEmpleados(FileInputStream pathArch) {
        this.pathArch = pathArch;
    }
    public ArrayList lecturaEmpleadosArchivo(){
        try {
            while(true){
                flujoEntradaEmp = new ObjectInputStream(pathArch);
                listaEmpleados.add((Empleado) flujoEntradaEmp.readObject());
            }
            
        } catch (EOFException error) {
            return listaEmpleados;
        } catch (Exception e) {
            return listaEmpleados;
        }
        
    }
}
