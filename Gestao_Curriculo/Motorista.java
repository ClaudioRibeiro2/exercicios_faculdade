public class Motorista extends Pessoa {
    // Atributos
    private int anosCompletos;
    private String cnh;

    // Construtor, SEMPRE VALIDAR
    public Motorista (String nome, String sobrenome,
                      int anosCompletos, String cnh)
    {
        super(nome, sobrenome);
        this.anosCompletos = (anosCompletos >= 18 && anosCompletos < 100
                              ? anosCompletos: -1);
        this.cnh = (cnh != null && !cnh.isBlank() ? cnh: "Não informado");
    }
    // Getter's & Setter's
    public int getAnosCompletos() {
        return this.anosCompletos;
    }
    public String getCnh() {
        return this.cnh;
    }
    // To String
    @Override
    public String toString() {
        return String.format("\t\t- MOTORISTA -%n%s:\t%s %s.%n%s:\t%d.%n%s:\t\t%s.%n",
	        "FUNCIONARIO", getNome(), getSobrenome(),
            "ANOS COMPLETOS", getAnosCompletos(),
            "CNH", getCnh()
           );
    }
}