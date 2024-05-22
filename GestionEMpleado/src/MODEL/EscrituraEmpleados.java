package MODEL;
import CONTROLLER.Empleado;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class EscrituraEmpleados {
    public ArrayList<Empleado> listaEmpleados;
    public ObjectOutputStream flujoSalidaEmp;
    public FileOutputStream pathArch;
    public EscrituraEmpleados(ArrayList<Empleado> listaEmpleados,FileOutputStream pathArch ) {
        this.listaEmpleados = listaEmpleados;
        
        this.pathArch=pathArch;
    }
    public void escribirEmpArchivo(){
        try {
            this.flujoSalidaEmp= new ObjectOutputStream(pathArch);
            for (Empleado emp:listaEmpleados) {
                flujoSalidaEmp.writeObject(emp);
                
            }
            flujoSalidaEmp.close();
        } catch (Exception e) {
        }
    }
    
}
