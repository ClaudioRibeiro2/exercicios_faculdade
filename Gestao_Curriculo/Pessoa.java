public class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    // Construtor, sempre validar os dados!
    public Pessoa (String nome, String sobrenome){
        this.nome = (nome != null && !nome.isBlank() ? nome: "Não informado");
        this.sobrenome = (sobrenome != null && !sobrenome.isBlank() ? sobrenome: "Não informado"); 
    }
    // Getter's e Seter's, não usarei setter's pq não quero alterar o nome da pessoa
    public String getNome (){
        return this.nome;
    }
    public String getSobrenome (){
        return this.sobrenome;
    }
    // To String
    public String toString() {
        return String.format("\t\t- PESSOA -%n%s:\t%s %s.%n",
	       "FUNCIONARIO", getNome(), getSobrenome());
    }
} // Fim da classe Pessoa