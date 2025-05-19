package 3etapaHerança_e_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
    private String nome;
    private String endereco;
    private List<Loja> lojas; // Lista para armazenar as > lojas


    // Construtor

    public Shopping(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new ArrayList<>();
    }

    // metodo para adicionar uma loja ao shopping

    public void adicionarLoja(Loja loja) {
        lojas.add(loja);
    }

    // metodo para listar todas as lojas

    public void listarLojas() {
        System.out.println("Lojas no shopping " + nome + ":");
        for (Loja loja : lojas) {
            System.out.println(loja.getNome());
        }
    }

    // metodo para calcular o total de gastos com salários de todas as lojas

    public double totalGastosComSalarios() {
        double total = 0;
        for (Loja loja : lojas) {
            total += loja.gastosComSalario();
        }
        return total;
    }

    // metodo para encontrar a loja com maior número de funcionários

    public Loja lojaComMaiorNumeroDeFuncionarios() {
        Loja maiorLoja = null;
        int maiorNumeroFuncionarios = 0;

        for (Loja loja : lojas) {
            if (loja.getQuantidadeFuncionarios() > maiorNumeroFuncionarios) {
                maiorNumeroFuncionarios = loja.getQuantidadeFuncionarios();
                maiorLoja = loja;
            }
        }

        return maiorLoja;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Loja> getLojas() {
        return lojas;
    }

    public void setLojas(List<Loja> lojas) {
        this.lojas = lojas;
    }

    // metodo toString utilizado para  exibir informações sobre o > shopping

        @Override
    public String toString() {
        return "Shopping: " + nome + "\nEndereço: " + endereco;
    }
}
