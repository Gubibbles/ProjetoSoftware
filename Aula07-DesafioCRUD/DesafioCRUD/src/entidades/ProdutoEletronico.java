package entidades;

public class ProdutoEletronico extends Produto{
    private int garantiaMeses;
    
    public ProdutoEletronico(String nome, double preco, int quantidade){
        super(nome, preco, quantidade);
        int gatantiaMeses = 0;
        this.garantiaMeses = gatantiaMeses;
    }
    
    @Override
    public String getDescricao(){return "Garantia: " + garantiaMeses + "meses";}
}
