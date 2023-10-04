public class Guepardo extends Animal implements Conversacao{
    private static final int VELOCIDADE_KMH = 130;

    public Guepardo() {
        setMetros(0);
    }

    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            double a = VELOCIDADE_KMH * 1000 / 3600 * segundos;
            calcDistancia(a);
            System.out.printf("O guepardo correu %.1f metros.%n",
			      getMetros());
        }
    }
    @Override
    public void falar(){
        System.out.println("Miau");
    }
} // fim da classe Guepardo