public class ClasseTesteEtapa1 {
    public static void main(String[] args) {

        // Testando a classe Data com dias mes e ano 

        Data data1 = new Data(15, 8, 2023);
        Data dataInvalida = new Data(31, 2, 2023); // Deve imprimir  mostrando no terminal 

        System.out.println("Data válida: " + data1);
        System.out.println("Data inválida (ajustada): " + dataInvalida);
        System.out.println("Ano " + data1.getAno() + " é bissexto? " + data1.verificaAnoBissexto());

        // teste na classe Endereco colocando um endereco  ficticio  mas nem tanto 
        
        Endereco endereco = new Endereco("Rua Central", "Porto Alegre", "RS", "Brasil", "90000-000", "123", "Apto 202");
        System.out.println("\nEndereço: " + endereco);

        // teste na classe Produto

        Produto produto = new Produto("Notebook", 3500.00);
        System.out.println("\nProduto: " + produto);

        // teste na classe Loja (construtor com todos os atributos)

        Loja loja1 = new Loja("Tech Store", 15, 2500.00);
        System.out.println("\nLoja 1:");
        System.out.println(loja1);
        System.out.println("Gastos com salário: R$ " + loja1.gastosComSalario());
        System.out.println("Tamanho da loja: " + loja1.tamanhoDaLoja());

        // teste  o construtor com salário base indefinido

        Loja loja2 = new Loja("Mini Loja", 5);
        System.out.println("\nLoja 2:");
        System.out.println(loja2);
        System.out.println("Gastos com salário: " + loja2.gastosComSalario());
        System.out.println("Tamanho da loja: " + loja2.tamanhoDaLoja());
    }
}
