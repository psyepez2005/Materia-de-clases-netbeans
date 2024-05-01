package TestPersona;
public class Trabajadores {
    public static void main(String[] args) {
        Trabajadores ps1 = new Trabajadores("Yan carlos",2000,100,1);
        ps1.calcularEdad();
        ps1.calcularBasico();
        ps1.calcularHorasExtra();
        System.out.println(ps1.toString());
        
    }
    
    public String nomb;
    private int ano;
    private double horas;
    private double costxHora;
    private double sueldo;
    private int edad;
    private double extraHoras;
    
    public Trabajadores(String nomb, int ano, int horas, int costxHora) {
        this.nomb = nomb;
        this.ano = ano;
        this.horas = horas;
        this.costxHora = costxHora;
    }
    public void calcularEdad(){
        this.edad = (2024-this.ano);
    }
    public void calcularBasico(){
        this.sueldo=(40*this.costxHora);
    }
    public void calcularHorasExtra(){
        if(this.horas>40){
            this.extraHoras= ((this.horas-40)*(this.costxHora*2));
        }
        this.sueldo=this.sueldo+this.extraHoras;
        double bonus=(this.edad<18)?(this.sueldo*0.05):(this.sueldo*0.1);
        this.sueldo+=bonus;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "nomb=" + nomb + ", ano=" + ano + ", horas=" + horas + ", costxHora=" + costxHora + ", sueldo=" + sueldo + ", edad=" + edad + ", extraHoras=" + extraHoras + '}';
    }

}
