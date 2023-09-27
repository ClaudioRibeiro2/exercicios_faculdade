public class Main {
    private static final int DURACAO = 60;
    private static final int INTERVALO = 5;

    public static void main(String[] args) {
        System.out.println("Simulador de Animais\n");

        FalcaoPeregrino michel = new FalcaoPeregrino();
        Guepardo luizinho = new Guepardo();
        PeixeAgulhao cris = new PeixeAgulhao();

	// continua no próximo slide
        for (int t = INTERVALO; t <= DURACAO; t += INTERVALO) {
            System.out.printf("t = %d%n", t);

            falcaoPeregrino.mover(INTERVALO);
            guepardo.mover(INTERVALO);
            peixeAgulhao.mover(INTERVALO);

            System.out.println();
        }
    } // fim do método Main
} // fim da classe Main