public class ClasseTesteEtapa4 {

    public static void main(String[] args) {
        
        // Endereços utilizados pelas lojas

        Endereco endereco1 = new Endereco("Av. Central", "Porto Alegre", "RS", "Brasil", "90000-000", "100", "Centro");
        Endereco endereco2 = new Endereco("Rua das Rosas", "Florianópolis", "SC", "Brasil", "88000-000", "45", "Bloco A");

        // Criação da loja de vestuário e inserção de produtos

        Loja lojaVest = new Vestuario("Fashion Store", endereco2);
        lojaVest.insereProduto(new Produto("Camiseta", 49.99, 10));
        lojaVest.insereProduto(new Produto("Calça Jeans", 89.90, 5));

        // Criação da loja de informática e inserção de produtos

        Loja lojaInfo = new Informatica("TechPlace", endereco1);
        lojaInfo.insereProduto(new Produto("Notebook", 2999.99, 3));
        lojaInfo.insereProduto(new Produto("Mouse Gamer", 199.90, 10));

        // Criação do shopping e inserção das lojas

        Shopping shopping = new Shopping("Shopping Sul", endereco1);
        shopping.insereLoja(lojaVest);
        shopping.insereLoja(lojaInfo);

        // Impressão de informações do shopping e contagem de lojas do tipo Informatica

        System.out.println(shopping);
        System.out.println("Lojas de informática: " + shopping.quantidadeLojasPorTipo("Informatica"));
    }
}
