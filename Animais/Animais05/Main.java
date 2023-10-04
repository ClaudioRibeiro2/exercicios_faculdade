public class Main {
    private static final int DURACAO = 60;
    private static final int INTERVALO = 5;

    public static void main(String[] args) {
        System.out.println("Simulador de Animais\n");

        Animal[] animais = new Animal[4];
        animais[0] = new FalcaoPeregrino();
        animais[1] = new Guepardo();
        animais[2] = new PeixeAgulhao();
        animais[3] = new Baleia();

        for (int t = INTERVALO; t <= DURACAO; t += INTERVALO) {
            System.out.printf("t = %d%n", t);
            
            for (Animal animal : animais){
                animal.mover(INTERVALO);
            }
            System.out.println();
        }
        Baleia b = new Baleia(); // Uma baleia que Move e Fala 
        b.mover(INTERVALO);
        b.falar();
        Conversacao c = new Baleia(); // Uma baleia que só Fala
        c.falar();
        Animal a = new Baleia(); // Uma baleia que só Move
        a.mover(INTERVALO);
    } // fim do método Main
} // fim da classe Main