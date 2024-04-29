package taller3.problema7;

public class Automotor {

    String cedula;
    String marca;
    int ano;
    double valorVehic;
    double valorMatric;

    public Automotor(String cedula, String marca, int ano, double valorVehic, double valorMatric) {
        this.cedula = cedula;
        this.marca = marca;
        this.ano = ano;
        this.valorVehic = valorVehic;
        this.valorMatric = valorMatric;
    }
    public void calcularValorMatricula(){
        valorMatric=(0.00002*valorVehic)*2024-ano;
    }
    
}
