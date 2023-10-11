import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscreverTabular extends Armazenar{
    // Atributos
    String nomeArquivo;
    File arquivo;
    ArrayList<NotaFiscal> listaNfs;
    // Construtor
    public EscreverTabular(String nomeArquivo) {
        setNomeArquivo(nomeArquivo);
        setArquivo(new File(""));
        setNotaFiscais(new ArrayList<>());
    }
    // Métodos
    public void criarArquivo (ArrayList<NotaFiscal> nfs) {
        String pathName = nomeArquivo + ".txt";
        try {
            FileWriter arquivo = new FileWriter(pathName);
            arquivo.write("0");
            arquivo.close();
            // criar uma String para armazenar as info da nf, com get
        } catch (IOException e) {
            System.out.println("Algum erro ocorreu.");
            e.printStackTrace();
        }
    }
    public void inserirNfs (ArrayList<NotaFiscal> listaNfs){
        this.listaNfs = listaNfs;
        for (NotaFiscal i: listaNfs){
            for (Produto j: i.getProdutos()) {
                String a = String.format(
                        "%d,%d,%.2f,%.2f",
                        j.getId(),
                        j.getQtde(),
                        j.getPrecoUn(),
                        j.getPrecoTotal());
                System.out.println(a);
            }
        }
    }
    // Getters & Setters
    public String getNomeArquivo() {
        return nomeArquivo;
    }
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public File getArquivo() {
        return arquivo;
    }
    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public ArrayList<NotaFiscal> getNotaFiscais() {
        return listaNfs;
    }
    public void setNotaFiscais(ArrayList<NotaFiscal> listaNfs) {
        this.listaNfs = listaNfs;
    }
} // Fim da classe SalvarTabular
