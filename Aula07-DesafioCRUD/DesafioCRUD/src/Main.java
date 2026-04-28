import entidades.Produto;
import entidades.GerenciarProdutos;
import entidades.ProdutoEletronico;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarProdutos gerenciador = new GerenciarProdutos();

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("==== MENU DE OPÇÕES ====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o valor do produto: ");
                    double preco = sc.nextDouble();

                    System.out.println("Digite o quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    Produto produto = new ProdutoEletronico(nome, preco, quantidade);
                    gerenciador.cadastrarProduto(produto);
                }

                case "2" -> {
                    gerenciador.listarProdutos();
                }

                case "3" -> {
                    gerenciador.listarProdutos();
                    System.out.println("Digite o ID do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Digite o valor do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite o quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    gerenciador.atualizarInformacoesProduto(id, nome, preco, quantidade);
                }

                case "4" -> {
                    gerenciador.listarProdutos();
                    System.out.println("Digite o ID do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    gerenciador.removerProduto(id);
                }

                case "5" -> {
                    System.out.println("Saindo do programa...");
                    return;
                }
            }
        }
    }
}
