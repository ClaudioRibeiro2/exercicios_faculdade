public class EngenheiroAgro extends Pessoa {
    // Atributos
    private int qtdeGado;
    private int hectarTerra;
    private String crea;
    // Construtor, sempre validar.
    public EngenheiroAgro(String nome,String sobrenome,int qtdeGado,int hectarTerra, String crea){
        super(nome,sobrenome);
        this.qtdeGado = (qtdeGado >= 0 ? qtdeGado: -1);
        this.hectarTerra = (hectarTerra >= 0 ? hectarTerra: -1);
        this.crea = (crea != null && !crea.isBlank() ? crea: "Não informado");
    }
    // Getter's 
    public int getQtdeGado (){
        return this.qtdeGado;
    }
    public int getHectarTerra (){
        return this.hectarTerra;
    }
    public String getCrea (){
        return this.crea;
    }
    // To String
    public String toString() {
        return String.format("\t\t- ENGENHEIRO - %n%s:\t%s %s.%n%s:\t%d.%n%s:\t%d.%n%s:\t\t%s.%n",
	       "FUNCIONARIO", getNome(), getSobrenome(),
           "QTDE GADO", getQtdeGado(),
           "HECTAR TERRA", getHectarTerra(),
           "CREA", getCrea());
    }
}