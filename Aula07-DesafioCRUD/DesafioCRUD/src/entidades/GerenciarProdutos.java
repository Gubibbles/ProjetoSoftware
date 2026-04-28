package entidades;

import java.util.ArrayList;
import java.util.List;

public class GerenciarProdutos {
    private List<Produto> produtos;

    public GerenciarProdutos(){
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto cadastrado com ID: " + produto.getId());
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("\n===== PRODUTOS CADASTRADOS =====");
        System.out.println("ID | Nome | Preço | Quantidade | Quantidade em Estoque | Descrição");
        for(Produto p : produtos){
            System.out.println(p);
        }
    }
    
    public void atualizarProduto(int id, String nome, double preco, int quantidade){
        Produto produto = buscarProdutoPorId(id);
            if (produto != null){
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);

                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Produto com ID " + id + "não encontrado.");
            }
    }

    public void removerProduto(int id){
        Produto produto = buscarProdutoPorId(id);
            if (produto != null){
                produtos.remove(produto);
                System.out.println("Produto removido.");
            } else {
                System.out.println("ID inválido.");
            }
    }

        private Produto buscarProdutoPorId(int id){
            for (Produto p : produtos) {
                if (p.getId() == id){
                    return p;}
            }
            return null;
        }
        
        public List<Produto> getProdutos(){
        return produtos;
        }

    public void atualizarInformacoesProduto(int id, String nome, double preco, int quantidade) {
    }
}
