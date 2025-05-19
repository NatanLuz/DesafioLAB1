public class ClasseTesteEtapa3 {
    public static void main(String[] args) {
        // Criando objetos Endereco e Data

        Endereco endereco = new Endereco("Rua A", "123", "Centro", "São Paulo", "SP", "12345-678", "Apto 101");
        Data dataFundacao = new Data(1, 1, 2000); // Exemplo de data

        // Criando um Produto com Data de validade

        Data validadeProduto = new Data(12, 12, 2023); // Exemplo de validade

        Produto produto = new Produto("Produto X", 100, 50.0, validadeProduto);

        // Criando lojas com diferentes categorias atribuindo as subclasses.. fazendo jus

        Loja lojaCosmetico = new Cosmetico("Loja de Cosméticos", 8, 1500.0, endereco, dataFundacao, produto, "Cosméticos");
        Loja lojaVestuario = new Vestuario("Loja de Vestuário", 12, 1200.0, endereco, dataFundacao, produto, "Vestuário");
        Loja lojaBijuteria = new Bijuteria("Loja de Bijuterias", 20, 1300.0, endereco, dataFundacao, produto, 1000.0);
        Loja lojaAlimentacao = new Alimentacao("Loja de Alimentação", 25, 1400.0, endereco, dataFundacao, produto, new Data(1, 1, 2025));
        Loja lojaInformatica = new Informatica("Loja de Informática", 30, 1600.0, endereco, dataFundacao, produto, 1500.0);

        // Exibindo as lojas

        System.out.println(lojaCosmetico);
        System.out.println(lojaVestuario);
        System.out.println(lojaBijuteria);
        System.out.println(lojaAlimentacao);
        System.out.println(lojaInformatica);
    }
}
