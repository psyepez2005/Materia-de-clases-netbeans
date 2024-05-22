package testterreno;

import java.util.Scanner;

public class TestTerreno {

    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        boolean opc = true;
        while (opc) {
            System.out.println("INgresa");
            Terreno t1 = new Terreno(put.nextDouble(), put.nextDouble(), put.nextDouble());
            t1.calcularArea();
            t1.calcularPrecio();
            System.out.println(t1.toString());
            System.out.println(t1.calcularPrecio());
            System.out.println("quire seguir?");
            String resp = put.next();
            opc = (resp.equals("N")) ? opc = false : opc;

        }
    }

}

class Terreno {
    public double alto;
    public double ancho;
    public double vmc;
    public double area;
    public double costoFinal;

    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
    }

    public void calcularArea() {
        this.area = this.alto * this.ancho;
    }

    public String calcularPrecio() {
        if (this.area > 300) {
            this.costoFinal = this.area * this.vmc - ((this.area * this.vmc) * 0.20);
            return "APLICA DESCUENTO DE 20%";
        } else if (this.area > 200) {
            this.costoFinal = this.area * this.vmc - ((this.area * this.vmc) * 0.10);
            return "APLICA DESCUENTO DE 10%";
        } else {
            this.costoFinal = this.area * this.vmc;
            return "NO HAY DESCUENTO";
        }
        

                                                
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + ", costoFinal=" + costoFinal + '}';
    }

}
