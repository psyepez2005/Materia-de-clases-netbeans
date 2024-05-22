package VIEW;

import CONTROLLER.Empleado;
import MODEL.EscrituraEmpleados;
import MODEL.LecturaEmpleados;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class EjecutorEmpleado {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmp = new ArrayList<Empleado>(Arrays.asList(new Empleado("Antonio",100,18),new Empleado("Juan",1000,50),new Empleado("PEPE",1500,23)));
        ArrayList<Empleado> listaEmp2 = new ArrayList<Empleado>();
        try {
            FileOutputStream pathArchSalida = new FileOutputStream("DataEmpl.dat");
            FileInputStream pathArchEntrada = new FileInputStream("DataEmpl.dat");
            EscrituraEmpleados escrituraEmp = new EscrituraEmpleados(listaEmp, pathArchSalida);
            escrituraEmp.escribirEmpArchivo();
            LecturaEmpleados lecturaEmpleados= new LecturaEmpleados(pathArchEntrada);
            lecturaEmpleados.lecturaEmpleadosArchivo();

        } catch (Exception e) {
        }
        
    }
}
