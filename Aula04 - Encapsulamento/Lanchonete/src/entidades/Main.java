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

    }
        
    }

}
