import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int mat[][] = new int[5][5];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < mat.length; i++){
            for (int y = 0; y < mat.length; y++){
                mat[i][y] = leitor.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++){
            for (int y = 0; y < mat.length; y++){
                System.out.print(mat[i][y] +"|");
            }
            System.out.println();
        }
        
        
        //Soma da linha
        int somaLinha = 0;
        System.out.println("Digite qual linha quer calcular:");
        int linha = leitor.nextInt();
        for (int i = linha; i < mat.length; i++){
            somaLinha =  somaLinha + mat[1][i];
        }
        System.out.println("Soma Linha:"+ somaLinha);
        //Soma Coluna
        System.out.println("Digite qual linha quer calcular:");
        int coluna = leitor.nextInt();
        int somaColuna = 0;
        for (int i = coluna; i < mat.length;i++){
            somaColuna = somaColuna + mat[i][3];
        }
        System.out.println("Soma Coluna:" +somaColuna);
        //Soma Diagonal Primaria
        int somaDiaPrimaria = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (i == j){
                    somaDiaPrimaria = somaDiaPrimaria + mat[i][j];
                }
            }
        }
        System.out.println("Soma Diagonal Principal:" +somaDiaPrimaria);
        //Soma Diagonal Segundaria
        
        int somaDiaSegundaria = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (i != j){
                    somaDiaSegundaria = somaDiaSegundaria+ mat[i][j];
                }
            }
        }
        System.out.println("Soma Diagonal Segundario: "+somaDiaSegundaria);
        
        //Soma total da matriz
        int somaTotal = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                somaTotal = somaTotal + mat[i][j];
            }
        }
        System.out.println("Soma:"+somaTotal);

    }

}
