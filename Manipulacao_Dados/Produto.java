public class Produto {
    // Atributos
    private long id;
    private int qtde;
    private double precoUn;
    private double precoTotal;
    // Construtor
    public Produto(long id, int qtde, double precoUn) {
        setId(id);
        setQtde(qtde);
        setPrecoUn(precoUn);
        setPrecoTotal(qtde * precoUn);
    }
    // Métodos

    // Getter's & Setter's
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getPrecoUn() {
        return precoUn;
    }
    public void setPrecoUn(double precoUn) {
        this.precoUn = precoUn;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    @Override
    public String toString() {
        return String.format(
                "%n\tProduto{%s %d, %s %d, %s R$ %.2f, %s R$ %.2f}",
                "id=", getId(),
                "qtde=", getQtde(),
                "precoUn=", getPrecoUn(),
                "precoTotal=", getPrecoTotal());
    }
} // Fim da classe Produto