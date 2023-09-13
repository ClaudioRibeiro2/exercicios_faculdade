/**
 * Loja é a classe que inicializa o programa.
 */
public class Loja {
    /**
     * Método que inicializa o programa.
     */
    public static void main(String[] args) {
        Vendedor jose = new Vendedor("José", "Silva", 2000.00);
        jose.setValorVendidoMes(12000.00);
        System.out.println(jose);

        jose.setValorVendidoMes(24000.00);
        System.out.printf("%nSalário do %s %s depois do aumento das vendas%n",
			  jose.getNome(), jose.getSobrenome());
        System.out.println(jose);
        System.out.println();

        VendedorComissionado joao = new VendedorComissionado("João", "Souza",
							     1500.00, 5);
        joao.setValorVendidoMes(12000.00);
        System.out.println(joao);

        joao.setValorVendidoMes(24000.00);
        System.out.printf("%nSalário do %s %s depois do aumento das vendas%n",
			  joao.getNome(), joao.getSobrenome());
        System.out.println(joao);
    } // fim do método main
} // fim da classe Loja