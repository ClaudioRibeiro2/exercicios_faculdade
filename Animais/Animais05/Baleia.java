public class Baleia extends Mamifero implements Conversacao{
    private static final int VELOCIDADE_KMH = 47;
    
    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            double a = VELOCIDADE_KMH * 1000 / 3600 * segundos;
            calcDistancia(a);
            System.out.printf("A baleia voou %.1f metros.%n",
			      getMetros());
        }
    }

    @Override
    public void falar(){
        System.out.println("Baleia não voa...");
    }
}
