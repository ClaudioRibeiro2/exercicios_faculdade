public class Produto {
    // Atributos
    private long id;
    private int qtde;
    private double precoUn;
    private double precoTotal;
    // Construtor
    public Produto (long id, int qtde, double precoUn){
        setId(id);
        setQtde(qtde);
        setPrecoUn(precoUn);
        this.precoTotal = getPrecoTotal();
    }
    // Getter's
    public long getId(){
        return this.id;
    }
    public int getQtde(){
        return this.qtde;
    }
    public double getPrecoUn(){
        return this.precoUn;
    }
    public double getPrecoTotal(){
        return this.precoTotal;
    }
    // Setter's
    public void setId(long newValue){
        this.id = newValue;
    }
    public void setQtde(int newValue){
        this.qtde = newValue;
    }
    public void setPrecoUn(double newValue){
        this.precoUn = newValue;
    }
    public void setPrecoTotal(double newValue) {
        this.precoTotal = newValue;
    }
    // Métodos
    public void calcPrecoTotal (){
        double calc = getQtde() * getPrecoUn();
        setPrecoTotal(calc);
    }
    // toString()
    @Override
    public String toString() {
        return String.format(
	       "%n\t%s: %d\t%s: %d\t%s: %.2f\t%s: %.2f%n",
	       "id", getId(),
	       "qtde", getQtde(),
	       "preco unitario", getPrecoUn(), 
           "total", getPrecoTotal());
    }
} // Fim da classe Produto