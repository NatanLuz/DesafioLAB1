import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1 - Criar loja");
        System.out.println("2 - Criar produto");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            // Se a opção for 1, cria uma nova loja
            System.out.println("\nCriando uma loja...");
            scanner.nextLine();  // limpa o buffer

            // dados da loja
            System.out.print("Nome da loja: ");
            String nomeLoja = scanner.nextLine();

            System.out.print("Número de funcionários: ");
            int numFuncionarios = scanner.nextInt();

            System.out.print("Salário base: ");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine(); // limpa o buffer

            // Endereço
            System.out.println("\nCriando endereço...");
            System.out.print("Nome da rua: ");
            String nomeRua = scanner.nextLine();
            System.out.print("Cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("Estado: ");
            String estado = scanner.nextLine();
            System.out.print("País: ");
            String pais = scanner.nextLine();
            System.out.print("CEP: ");
            String cep = scanner.nextLine();
            System.out.print("Número: ");
            String numero = scanner.nextLine();
            System.out.print("Complemento: ");
            String complemento = scanner.nextLine();

            Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

            // Data de fundação
            System.out.println("\nCriando data de fundação...");
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Mês: ");
            int mes = scanner.nextInt();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            Data dataFundacao = new Data(dia, mes, ano);

            // Produto
            System.out.println("\nCriando produto...");
            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = scanner.nextDouble();

            System.out.println("\nData de validade do produto...");
            System.out.print("Dia: ");
            int diaVal = scanner.nextInt();
            System.out.print("Mês: ");
            int mesVal = scanner.nextInt();
            System.out.print("Ano: ");
            int anoVal = scanner.nextInt();

            Data validadeProduto = new Data(diaVal, mesVal, anoVal);
            Produto produto = new Produto(nomeProduto, precoProduto, validadeProduto);

            // Criando a loja com o produto

            Loja loja = new Loja(nomeLoja, numFuncionarios, salarioBase, endereco, dataFundacao, produto);

            // Exibindo informações

            System.out.println("\nInformações da loja:");
            System.out.println(loja);

        } else if (opcao == 2) {

            // Cria apenas um produto

            System.out.println("\nCriando um produto...");
            scanner.nextLine(); 

            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            System.out.println("\nData de validade...");
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Mês: ");
            int mes = scanner.nextInt();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();

            Data dataValidade = new Data(dia, mes, ano);
            Produto produto = new Produto(nomeProduto, preco, dataValidade);

            // Verifica o vencimento do produto

            Data dataAtual = new Data(6, 5, 2025); // Data atual fictícia para teste
            if (produto.estaVencido(dataAtual)) {
                System.out.println("\nPRODUTO VENCIDO");
            } else {
                System.out.println("\nPRODUTO NÃO VENCIDO");
            }

            System.out.println("\nInformações do produto:");
            System.out.println(produto);

        } else if (opcao == 3) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
