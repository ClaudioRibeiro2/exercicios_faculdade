import java.util.ArrayList;
import java.util.Random;

public class NotaFiscal {
    // Atributos
    Random r = new Random();
    private ArrayList<Produto> produtos;
    private int numeroNf;
    private int qtdeProdutos;
    // Construtor
    public NotaFiscal (int numeroNf,int qtdeProdutos){
        this.numeroNf = numeroNf;
        this.qtdeProdutos = qtdeProdutos;
        this.produtos = new ArrayList();
    }
    // Getter's
    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }
    public int getNumeroNf(){
        return this.numeroNf;
    }
    public int getQtdeProdutos(){
        return this.qtdeProdutos;
    }
    // Setter's
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setNumeroNf(int numeroNf) {
        this.numeroNf = numeroNf;
    }

    public void setQtdeProdutos(int qtdeProdutos) {
        this.qtdeProdutos = qtdeProdutos;
    }
    // Métodos
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    // toString()
    @Override
    public String toString() {
        return String.format(
	       "NF-e: %d%n\tQTDE PRODUTOS: %d%n\t",
	       getNumeroNf(),
           getQtdeProdutos());
    }
} // Fim da classe NotaFiscal