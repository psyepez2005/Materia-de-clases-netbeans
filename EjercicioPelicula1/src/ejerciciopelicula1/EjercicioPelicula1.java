package ejerciciopelicula1;

import java.util.ArrayList;
import java.util.Arrays;

public class EjercicioPelicula1 {
    public static void main(String[] args) {
        DVD soportDVD = new DVD(5);
        VHS soportVHS = new VHS("maskin");
        Soporte objSop = new Soporte();
        ArrayList <Pelicula> listaPelis = new ArrayList<Pelicula>(Arrays.asList(
                                        new Pelicula("SIMBA", "Jorge", "2000", "Ingles", objSop),
                                        new Pelicula("BADBOYS", "Papu", "2015", "Aleman", objSop),
                                        new Pelicula("LANA", "Reyna", "2000", "Ingles", objSop)
                                        ));
        for (Pelicula peli : listaPelis) {
            System.out.println(peli);
        }
    }
    
}
class Pelicula{
    
    public String titulo;
    public String autor;
    public String anoEdicion;
    public String idioma;
    public double costoAlq;
    public Soporte soporte;

    public Pelicula(String titulo, String autor, String anoEdicion, String idioma, Soporte soporte) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoEdicion = anoEdicion;
        this.idioma = idioma;
        this.soporte = soporte;
    }


    public void calcularCostoAlquiler(){}
    
    @Override
    public String toString() {
        return "Pelicula{" + "autor=" + autor + ", anoEdicion=" + anoEdicion + ", idioma=" + idioma + ", costoAlq=" + costoAlq + ", soporte=" + soporte + '}';
    }
}
class Soporte{}
class DVD extends Soporte{
    public double capacidad;

    public DVD(double capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return "DVD{" + "capacidad=" + capacidad + '}';
    }
    
}
class VHS extends Soporte{
    public String tipoCinta;

    public VHS(String tipoCinta) {
        this.tipoCinta = tipoCinta;
    }

    @Override
    public String toString() {
        return "VHS{" + "tipoCinta=" + tipoCinta + '}';
    }
    
}

