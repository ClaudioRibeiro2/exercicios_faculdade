import java.util.ArrayList;
import java.util.Random;

public class NotaFiscal {
    // Atributos
    private int numeroNf;
    private int qtdeProdutos;
    private ArrayList<Produto> produtos;
    private double totalNf;
    // Construtor
    public NotaFiscal(int numeroNf, int qtdeProdutos) {
        setNumeroNf(numeroNf);
        setQtdeProdutos(qtdeProdutos);
        setProdutos(new ArrayList<>());
    }
    // Métodos
    public void addProdutos(Produto newValue){
        produtos.add(newValue);
    }
    public void generateProdutos(int id, int qtde, double precoUn){
            Produto produto = new Produto(id, qtde, precoUn);
            addProdutos(produto);
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

    public int getQtdeProdutos() {
        return qtdeProdutos;
    }
    public void setQtdeProdutos(int newValue) {
        this.qtdeProdutos = newValue;
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
                "NotaFiscal {%n%s %d,%n%s %d,%n%s R$ %.2f,%n%s %s%n}",
                "numeroNf=", getNumeroNf(),
                "qtdeProdutos=", getQtdeProdutos(),
                "totalNf", getTotalNf(),
                "produtos=", getProdutos());
    }
} // Fim da classe NotaFiscal