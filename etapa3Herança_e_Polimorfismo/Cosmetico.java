

public class Cosmetico extends Loja {
    private String categoria;
 
    public Cosmetico(String var1, int var2, double var3, Endereco var5, Data var6, Produto var7, String var8) {
       super(var1, var2, var3, var5, var6, var7);
       this.categoria = var8;
    }
 
    public String getCategoria() {
       return this.categoria;
    }
 
    public void setCategoria(String var1) {
       this.categoria = var1;
    }
 
    public String toString() {
       String var10000 = super.toString();
       return var10000 + "\nCategoria: " + this.categoria;
    }
 }
 