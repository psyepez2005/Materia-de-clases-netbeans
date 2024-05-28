package MODEL;
import CONTROLLER.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscribirEmpleado {
    ObjectOutputStream flujoSalida;
    FileOutputStream path;
    ArrayList<Empleado> listaEmpleados;

    public EscribirEmpleado(FileOutputStream path, ArrayList<Empleado> listaEmpleados) {
        
        this.path = path;
        this.listaEmpleados = listaEmpleados;
    }
    public void escribirObjetosEmpleado(){
        try {
            this.flujoSalida = new ObjectOutputStream(path);
            for (Empleado emp : listaEmpleados) {
                flujoSalida.writeObject(emp);
            }
            
        } catch (Exception e) {
        }
    }
}
