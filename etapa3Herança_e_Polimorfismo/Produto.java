public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private Data validade; // Adicionando a validade com > Data

    // Construtor com 4 parâmetros

    public Produto(String nome, int quantidade, double preco, Data validade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.validade = validade;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }


    public String toString() {
        return nome + " - " + quantidade + " unidades - R$ " + preco + " - Validade: " + validade;
    }
}
