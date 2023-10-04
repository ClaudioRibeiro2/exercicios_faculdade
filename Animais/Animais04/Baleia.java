public class Baleia extends Animal {
    private static final int VELOCIDADE_KMH = 47;
    
    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            double a = VELOCIDADE_KMH * 1000 / 3600 * segundos;
            calcDistancia(a);
            System.out.printf("O falcão peregrino voou %.1f metros.%n",
			      getMetros());
        }
    }
}
