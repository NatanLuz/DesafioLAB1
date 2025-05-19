public class Vestuario extends Loja {
   private String tipoDeVestuario;

   public Vestuario(String var1, int var2, double var3, Endereco var5, Data var6, Produto var7, String var8) {
      super(var1, var2, var3, var5, var6, var7);
      this.tipoDeVestuario = var8;
   }

   public String getTipoDeVestuario() {
      return this.tipoDeVestuario;
   }

   public void setTipoDeVestuario(String var1) {
      this.tipoDeVestuario = var1;
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + "\nTipo de Vestuário: " + this.tipoDeVestuario;
   }
}
