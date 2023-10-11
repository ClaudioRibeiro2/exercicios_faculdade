import java.util.ArrayList;
import java.util.Random;

public class NotaFiscal {
    // Atributos
    private int numeroNf;
    private ArrayList<Produto> produtos;
    private double totalNf;
    // Construtor
    public NotaFiscal(int numeroNf) {
        setNumeroNf(numeroNf);
        setProdutos(new ArrayList<>());
    }
    // Métodos
    public void adicionarProdutos(Produto newValue){
        produtos.add(newValue);
    }
    public void inserirProdutos(int id, int qtde, double precoUn){
            Produto produto = new Produto(id, qtde, precoUn);
            adicionarProdutos(produto);
            double agregador = produto.getPrecoTotal();
            setTotalNf(agregador);
    }
    // Getter's & Setter's
    public int getNumeroNf() {
        return numeroNf;
    }
    public void setNumeroNf(int newValue) {
        this.numeroNf = newValue;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> newValue) {
        this.produtos = newValue;
    }

    public double getTotalNf() {
        return totalNf;
    }
    public void setTotalNf(double newValue) {
        this.totalNf += newValue;
    }
    // toString
    @Override
    public String toString() {
        return String.format(
                "NotaFiscal {%s %d, %s R$ %.2f, %s %s%n}",
                "numeroNf=", getNumeroNf(),
                "totalNf", getTotalNf(),
                "produtos=", getProdutos());
    }
} // Fim da classe NotaFiscal