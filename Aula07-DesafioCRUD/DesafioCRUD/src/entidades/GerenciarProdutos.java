package entidades;

import java.util.ArrayList;

public class GerenciarProdutos {
    private ArrayList<Produto> ListaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        ListaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos(){
        if (ListaProdutos.isEmpty()){
            System.out.println("Nenhum produto encontrado.");
        } else {
            System.out.println("| ID | NOME | PREÇO | QUANTIDADE | VALOR EM ESTOQUE |");
            for (int i = 0; i < ListaProdutos.size(); i++) {
                System.out.println("|" + i + ListaProdutos.get(i));
            }
        }
    }

    public void atualizarProduto(int id, String nome, double preco, int quantidade){
        Produto produto = ListaProdutos.get(id);

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        System.out.println("Produto atualizado com sucesso!");
    }

    public void removerProduto(int id){
        ListaProdutos.remove(id);
        System.out.println("Produto removido com sucesso!");
    }

    public void alterarInformacoesProduto(int id, String nome, double preco, int quantidade) {
    }
}
