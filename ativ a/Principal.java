public class Principal {

    public static void main(String[] args) {
        Vaga vaga = new Vaga();
        Vaga vetVaga[] = new Vaga[10];
        vetVaga[0]= new Vaga();
        vetVaga[0].addCarro("AAA4444",114.55f);

        for (int i = 0; i < vetVaga.length; i++){
            System.out.println(vetVaga[i]);
        }


    }
}
