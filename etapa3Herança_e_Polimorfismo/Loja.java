// Source code is decompiled from a .class file using FernFlower decompiler.
public class Loja {
   private String nome;
   private int quantidadeFuncionarios;
   private double salarioBaseFuncionario;
   private Endereco endereco;
   private Data dataFundacao;
   private Produto produto;

   public Loja(String var1, int var2, double var3, Endereco var5, Data var6, Produto var7) {
      this.nome = var1;
      this.quantidadeFuncionarios = var2;
      this.salarioBaseFuncionario = var3;
      this.endereco = var5;
      this.dataFundacao = var6;
      this.produto = var7;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String var1) {
      this.nome = var1;
   }

   public int getQuantidadeFuncionarios() {
      return this.quantidadeFuncionarios;
   }

   public void setQuantidadeFuncionarios(int var1) {
      this.quantidadeFuncionarios = var1;
   }

   public double getSalarioBaseFuncionario() {
      return this.salarioBaseFuncionario;
   }

   public void setSalarioBaseFuncionario(double var1) {
      this.salarioBaseFuncionario = var1;
   }

   public Endereco getEndereco() {
      return this.endereco;
   }

   public void setEndereco(Endereco var1) {
      this.endereco = var1;
   }

   public Data getDataFundacao() {
      return this.dataFundacao;
   }

   public void setDataFundacao(Data var1) {
      this.dataFundacao = var1;
   }

   public Produto getProduto() {
      return this.produto;
   }

   public void setProduto(Produto var1) {
      this.produto = var1;
   }

   public double gastosComSalario() {
      return (double)this.quantidadeFuncionarios * this.salarioBaseFuncionario;
   }

   public char tamanhoDaLoja() {
      if (this.quantidadeFuncionarios < 10) {
         return 'P';
      } else {
         return (char)(this.quantidadeFuncionarios <= 30 ? 'M' : 'G');
      }
   }

   public String toString() {
      String var10000 = this.nome;
      return "Loja: " + var10000 + "\nFuncionários: " + this.quantidadeFuncionarios + "\nSalário base: R$ " + this.salarioBaseFuncionario + "\nEndereço: " + String.valueOf(this.endereco) + "\nFundação: " + String.valueOf(this.dataFundacao) + "\nProduto: " + String.valueOf(this.produto) + "\nTamanho da loja: " + this.tamanhoDaLoja();
   }
}
