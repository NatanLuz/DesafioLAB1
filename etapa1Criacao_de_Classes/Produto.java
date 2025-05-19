public class Produto {

    private String nome;
    private double preco;

    // Construtor da classe produto imprimindo nome e preco this > garante que o parâmetro correto seja atribuido ao atributo da instancia
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodo toString
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco;
    }
}
