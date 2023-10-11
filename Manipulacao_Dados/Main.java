import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<NotaFiscal> listaNF = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            NotaFiscal nota = new NotaFiscal(r.nextInt(999) + 1);
            for (int a = 0; a < 5; a++) {
                nota.inserirProdutos(
                        r.nextInt(999) + 1,
                        r.nextInt(4) + 1,
                        r.nextDouble(51) + 0.001
                );
            }
            listaNF.add(nota);
        }
        EscreverTabular tabular = new EscreverTabular("batata");
        tabular.inserirNfs(listaNF);
    } // Fim do método main
} // Fim da classe Main
