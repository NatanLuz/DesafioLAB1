public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas; // array de ate 100 lojas

    public Shopping(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[100];
    }

    public boolean insereLoja(Loja loja) {
        
        // insere  loja no primeiro espaço disponivel do  array 

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].toString().contains(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {

        //conta quantas lojas sao de um determinado tipo 
        
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco.toString()).append("\n");
        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) sb.append(loja.toString()).append("\n");
        }
        return sb.toString();
    }
}
