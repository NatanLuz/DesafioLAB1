
public class Alimentacao extends Loja {
    private Data dataAlvara;
 
    public Alimentacao(String var1, int var2, double var3, Endereco var5, Data var6, Produto var7, Data var8) {
       super(var1, var2, var3, var5, var6, var7);
       this.dataAlvara = var8;
    }
 
    public Data getDataAlvara() {
       return this.dataAlvara;
    }
 
    public void setDataAlvara(Data var1) {
       this.dataAlvara = var1;
    }
 
    public String toString() {
       String var10000 = super.toString();
       return var10000 + "\nData do Alvará: " + String.valueOf(this.dataAlvara);
    }
 }
 