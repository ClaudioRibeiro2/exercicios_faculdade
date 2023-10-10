import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Armazenar {
    // Atributos
    String nomeArquivo;
    File arquivo;
    // Construtor
    public Armazenar(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.arquivo = new File("");
    }
    // Métodos
    public void criarArquivo () {
        String pathName = nomeArquivo + ".java"; // Tipo do arquivo, como .java, .docx, .txt, ...
        try {
            FileWriter arquivo = new FileWriter(pathName);
            arquivo.write("Teste");
            // criar uma String para armazenar as info da nf, com get
        } catch (IOException e) {
            System.out.println("Algum erro ocorreu.");
            e.printStackTrace();
        }
    }
    // Getters & Setters
    public File getArquivo() {
        return arquivo;
    }
    public void setArquivo(File newValue) {
        this.arquivo = newValue;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
} // Fim da classe Armazenar
