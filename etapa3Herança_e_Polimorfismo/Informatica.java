public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, Produto produto, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, produto);
        this.seguroEletronicos = seguroEletronicos;
    }


    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // sobrescrevendo > toString()

    @Override
    public String toString() {
        return super.toString() + "\nSeguro de Eletrônicos: R$ " + seguroEletronicos;
    }
}
