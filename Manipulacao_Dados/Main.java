import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Atributos
        Random r = new Random();
        Produto a = new Produto(r.nextLong(100),
                                r.nextInt(11+1),
                                r.nextDouble(51+1));
        System.out.println(a);
    }
} // Fim da classe Main
