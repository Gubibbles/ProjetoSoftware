package entidades;

import entidades.lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lanche x_burguer= new lanche("x-burguer",
                "Pão, Hamburguer,Queijo, Maionese verde",
                24.9, 10);
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("----Lista De Opções----");
        System.out.println("1 - Fazer Pedido");
        System.out.println("2 - Adicionar No Estoque");
        System.out.println("3- Inforção Do Lanche");
        System.out.println("4 - Alterar Valor");
        System.out.println("5 - Alterar Descrição");
        System.out.println("6 - Sair");
        System.out.print("Digite a opção desejada");
        String opcao = sc.nextLine();

        switch (opcao){

            case "1":
                System.out.println("Quantos lanches voccê dseja?: ");
                int quantidade = sc.nextInt();
                sc.nextLine();

                if(x_burguer.decrementaEstoque(quantidade)){
                    System.out.println("Você pediu " + quantidade +
                            " " + x_burguer.getNome() + "e o valor final foi de R$ " +
                            x_burguer.valorTotal(quantidade)
                    );
                } else {
                    System.out.println("Pedido não realizado!");
                    System.out.println("Quantidade inválida");
                }
                break;

            case "2":
                System.out.println("Quantos lanches deseja adicionar?: ");
                int quantidadeEstoque = sc.nextInt();
                sc.nextLine();
                x_burguer.incrementaEstoque(quantidadeEstoque);
                break;

            case "3":
                System.out.println(x_burguer.toString());
                break;

            case "4":
                System.out.println("O lanche" + x_burguer.getNome() +
                        " custa R$ " + x_burguer.getValor()
                );
                System.out.println("Informe o novo valor do lanche: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                x_burguer.setValor(valor);
                break;

            default:
                System.out.println("Informe uma opção válida");
                break;

            case "5":
                System.out.println("O lanche " + x_burguer.getNome() +
                        "tem a seguinte descrição: " +  x_burguer.getDescricao());

                System.out.println("Informe a nova descrição: ");
                String descricao = sc.nextLine();

                x_burguer.setDescricao(descricao);
                break;

        }

    }
        
    }

}
