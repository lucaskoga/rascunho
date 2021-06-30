import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Vaganum = leitor.nextInt();
        Vaga vagavet[] = new Vaga[Vaganum];
        Vaga vaga = new Vaga();


        vagavet[1] = new Vaga();
        vagavet[1].adicionarCarro();

        for (int i = 0; i < vagavet.length; i++) {
            vagavet[i] = vagavet[i];
            System.out.println(vagavet[i]);

        }
    }
}
