/**
 * VendedorComissionado é uma classe que representa um vendedor de uma loja que
 * recebe mensalmente o salário base mais uma comissão correspondente a um
 * porcentual do total de vendas no mês.
 */
public class VendedorComissionado extends Vendedor {
    private int porcentualComissao;

    // continua no próximo slide
    /**
     * Construtor que inicializa o nome, sobrenome, salário base e procentual
     * de comissão.
     */
    public VendedorComissionado(String nome, String sobrenome,
				double salarioBase, int porcentualComissao) {
        // chama o construtor da superclasse
        super(nome, sobrenome, salarioBase);

        this.porcentualComissao = (porcentualComissao > 0 ?
				   porcentualComissao : 0);
    }

    // continua no próximo slide
    public int getPorcentualComissao() {
        return this.porcentualComissao;
    }

    @Override
    public double getSalario() {
        return getSalarioBase() + this.porcentualComissao / 100.0 *
	    getValorVendidoMes();
    }

    // continua no próximo slide
    @Override
    public String toString() {
        return String.format(
	    "%s: %s %s%n\t%s: $ %.2f%n\t%s: %d%%%n\t%s: $ %.2f%n\t%s: $ %.2f",
	    "Vendedor", getNome(), getSobrenome(),
	    "Salário Base", getSalarioBase(), "Comissão",
	    this.getPorcentualComissao(), "Vendas no mês",
	    getValorVendidoMes(), "Salário", getSalario());
    }
} // fim da classe VendedorComissionado