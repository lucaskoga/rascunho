import java.util.Scanner;

public class Vaga {
    private String placa;
    private double horaLocal;
    private double tempoEntrada;
    private double tempoSaida;
    private double valor;

    Scanner leitor = new Scanner(System.in);

    //Construtor
    public Vaga() {
        placa = "";
        horaLocal = 0;
        valor = 0;
    }
    //Adicionar carro
    public void addCarro(String placa,double tempoDeEntrada){
        this.placa = placa;
        this.tempoEntrada = tempoDeEntrada;
    }
    public String Placa(){
        return placa;
    }
    public double TempoEntrada(){
        return tempoEntrada;
    }

    public void removerCarro(){
        double tempoSaida = leitor.nextDouble();
        horaLocal = tempoEntrada - tempoSaida;
        for (int i = 0; i < 24; i++){
            if (horaLocal > 0){
                i = i * 60;
                valor = valor + 5;
                horaLocal = horaLocal - 60;
            }
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getHoraLocal() {
        return horaLocal;
    }

    public void setHoraLocal(double horaLocal) {
        this.horaLocal = horaLocal;
    }

    public double getTempoEntrada() {
        return tempoEntrada;
    }

    public void setTempoEntrada(double tempoEntrada) {
        this.tempoEntrada = tempoEntrada;
    }

    public double getTempoSaida() {
        return tempoSaida;
    }

    public void setTempoSaida(double tempoSaida) {
        this.tempoSaida = tempoSaida;
    }
}
