import java.util.Scanner;

public class CarroF1 {
    String equipe;
    String fabricante_de_Motor;
    String pneu;
    String cor_Predominante;
    String piloto1;
    String piloto2;
    float peso;
    Scanner entrada = new Scanner(System.in);

    CarroF1(){
        equipe ="";
        fabricante_de_Motor = "";
        pneu = "";
        cor_Predominante = "";
        piloto1 = "";
        piloto2 = "";
        peso = 0;
    }
    void cadastra(String equipe, String fabricante_de_MotorMotor, String pneus, String cor_Predominante, String piloto1, String piloto2, float peso) {
        this.equipe = equipe;
        this.fabricante_de_Motor = fabricante_de_MotorMotor;
        this.pneu = pneu;
        this.cor_Predominante = cor_Predominante;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.peso = peso;

    }
    public void imprimir(){
        System.out.println("\nEquipe:" + equipe);
        System.out.println("\nFabricante de Motor:" + fabricante_de_Motor);
        System.out.println("\nPneu:" + pneu);
        System.out.println("\nCor Predominante:" + cor_Predominante);
        System.out.println("\nPiloto1:" + piloto1);
        System.out.println("\nPiloto2:" + piloto2);
        System.out.println("\nPeso:" + peso);

    }

}
