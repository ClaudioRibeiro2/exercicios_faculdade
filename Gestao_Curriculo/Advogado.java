public class Advogado extends Pessoa{
    // Atributos
    private String oab;
    // Construtor, sempte validar os dados!
    public Advogado (String nome, String sobrenome, String oab){
        super(nome, sobrenome);
        this.oab = (oab != null && !oab.isBlank() ? oab: "Não informado");
    }
    // Getter's
    public String getOab (){
        return this.oab;
    }
    // To String
    public String toString (){
    return String.format("\t\t- ADVOGADO -%n%s:\t%s %s.%n%s:\t\t%s.%n",
	    "FUNCIONARIO", getNome(), getSobrenome(),   
        "OAB", getOab());
    }
}