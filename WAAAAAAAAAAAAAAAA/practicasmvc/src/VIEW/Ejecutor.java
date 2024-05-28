package VIEW;
import CONTROLLER.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejecutor {
    public static void main(String[] args) {
        String carrerasDemandadas[]={"COMPUTACION","MEDICINA","MARKETING"};
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(Arrays.asList(
                new Empleado("COMPUTACION",20,7),
                new Empleado("ADMINISTRACION",18,10),
                new Empleado("MEDICINA",30,6),
                new Empleado("ARTES",20,9)));
        
        Empresa enterprise = new Empresa(listaEmpleados);
        enterprise.asignarEstrellas(carrerasDemandadas);
        System.out.println(enterprise);
    }
    
}
