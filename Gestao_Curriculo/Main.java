// Inicializadora do programa
public class Main {
    // Método Main
    public static void main (String [] args){
        Pessoa natalia = new Pessoa("Natalia", "Koehler");
        System.out.println(natalia);

        Motorista claudio = new Motorista("Claudio", "Conti", 19, "1234567891");
        System.out.println(claudio);

        Advogado cris = new Advogado("Cris", "Lisboa", "SC123456");
        System.out.println(cris);

        EngenheiroAgro rodrigo = new EngenheiroAgro("Rodrigo", "Conti", 10, 
                                                    5000, "1234567891");
        System.out.println(rodrigo);
    } // Fim da classe MAIN
} // Fim da classe Main