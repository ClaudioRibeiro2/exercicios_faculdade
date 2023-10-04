public abstract class Animal {
    // Atributos
    private double metrosPercorridos;
    // Get & Set
    public void setMetros(double m){
        this.metrosPercorridos = m; 
    }
    public double getMetros(){
        return this.metrosPercorridos;
    }
    // Métodos
    public double calcDistancia(double m){
        this.metrosPercorridos += m;
        return this.metrosPercorridos;
    }
    public abstract void mover(int segundos); // Método abstrato
} // Fim da classe Animal