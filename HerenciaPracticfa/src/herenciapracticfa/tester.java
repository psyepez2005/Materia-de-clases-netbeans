package herenciapracticfa;

public class tester {

    public static void main(String[] args) {
        ReparacionMecanica trabMecan = new ReparacionMecanica(0, 0, "Moto de riki", 14);
        ReparacionChapasPintura trabChepas = new ReparacionChapasPintura(0, 1, "323 de iflin", 21);
        Revision trabRevi = new Revision(0, "Vitarita", 0);
        trabMecan.setEstado("INICIADO");
        trabChepas.setEstado("INICIADO");
        trabRevi.setEstado("INICIADO");
        trabMecan.aumentarPrecio(100);
        trabMecan.aumentarHoras(5.5);
        trabMecan.calcularCostoTrabajo();
        System.out.println(trabMecan);
        System.out.println(trabChepas);
        System.out.println(trabRevi);
    }
}

class Trabajo {

    public int id;
    public String descripcion;
    public double numeroHoras;
    public String estado;
    public double costoTrabajo;
    public int plazo;

    public Trabajo() {
    }

    public Trabajo(int id, String descripcion, double numeroHoras) {
        this.id = id;
        this.descripcion = descripcion;
        this.numeroHoras = numeroHoras;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aumentarHoras(double numeroHorasAumentadas) {
        this.numeroHoras += numeroHorasAumentadas;
    }

    public double calcularCostoTrabajo() {
        this.costoTrabajo = this.numeroHoras * 30;
        return this.costoTrabajo;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", descripcion=" + descripcion + ", numeroHoras=" + numeroHoras + ", estado=" + estado + ", costoTrabajo=" + costoTrabajo + ", plazo=" + plazo + '}';
    }
}






class ReparacionMecanica extends Trabajo {

    public double precioMaterial;

    public ReparacionMecanica(double precioMaterial, int id, String descripcion, double numeroHoras) {
        super();
        this.precioMaterial = precioMaterial;
    }

    @Override
    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCostoTrabajo() + (this.precioMaterial * 1.1);
        return this.costoTrabajo;
    }

    public void aumentarPrecio(double precioMaterialExtra) {
        this.precioMaterial += precioMaterialExtra;
    }

    @Override
    public String toString() {
        return "ReparacionMecanica{" + super.toString() + "precioMaterial=" + precioMaterial + '}';
    }
}






class ReparacionChapasPintura extends Trabajo {

    public double precioMaterial;

    public ReparacionChapasPintura(double precioMaterial, int id, String descripcion, double numeroHoras) {
        super(id, descripcion, numeroHoras);
        this.precioMaterial = precioMaterial;
    }

    @Override
    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCostoTrabajo() + (this.precioMaterial * 1.3);
        return this.costoTrabajo;
    }

    public void aumentarPrecio(double precioMaterialExtra) {
        this.precioMaterial += precioMaterialExtra;
    }

    @Override
    public String toString() {
        return "ReparacionChapasPintura{" + super.toString() + "precioMaterial=" + precioMaterial + '}';
    }
}






class Revision extends Trabajo {
    
    public Revision(int id, String descripcion, double numeroHoras) {
        super(id, descripcion, numeroHoras);
    }
    @Override
    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCostoTrabajo() + 20;
        return this.costoTrabajo;
    }
}
