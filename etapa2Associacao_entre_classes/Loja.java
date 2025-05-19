public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco; // Associação com a > classe Endereco
    private Data dataFundacao; // Associação com a > classe Data
    private Produto produto;   // Associação com a > classe Produto

    // Construtor loja
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                Endereco endereco, Data dataFundacao, Produto produto) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.produto = produto;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    // metodo que calcula os gastos com salários

    public double gastosComSalario() {
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    // metodo que retorna o tamanho da loja com base no número de funcionários

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    // metodo to String com dados da loja

    public String toString() {
        return "Loja: " + nome +
               "\nFuncionários: " + quantidadeFuncionarios +
               "\nSalário base: R$ " + salarioBaseFuncionario +
               "\nEndereço: " + endereco +
               "\nFundação: " + dataFundacao +
               "\nProduto: " + produto +
               "\nTamanho da loja: " + tamanhoDaLoja();
    }
}