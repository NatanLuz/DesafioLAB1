public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade; // Associação com a classe > Data

    // Construtor atualizado com data de validade

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
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

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Verifica se o produto está vencido comparando com uma data atual

    public boolean estaVencido(Data dataAtual) {
        return this.dataValidade != null && dataValidade.comparar(dataAtual) < 0;
    }

    // Representação textual do produto
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco;
    }
}