public class Bijuteria extends Loja {
    private double metaVendasMensal;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, Produto produto, double metaVendasMensal) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, produto);
        this.metaVendasMensal = metaVendasMensal;
    }

    public double getMetaVendasMensal() {
        return metaVendasMensal;
    }

    public void setMetaVendasMensal(double metaVendasMensal) {
        this.metaVendasMensal = metaVendasMensal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMeta de Vendas Mensal: R$ " + metaVendasMensal;
    }
}
