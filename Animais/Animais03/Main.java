public class Main {
    private static final int DURACAO = 60;
    private static final int INTERVALO = 5;

    public static void main(String[] args) {
        System.out.println("Simulador de Animais\n");

        Animal[] animais = new Animal[3];
        animais[0] = new FalcaoPeregrino();
        animais[1] = new Guepardo();
        animais[2] = new PeixeAgulhao();

	// continua no próximo slide
        for (int t = INTERVALO; t <= DURACAO; t += INTERVALO) {
            System.out.printf("t = %d%n", t);

            animais[0].mover(INTERVALO);
            animais[1].mover(INTERVALO);
            animais[2].mover(INTERVALO);

            System.out.println();
        }
    } // fim do método Main
} // fim da classe Main