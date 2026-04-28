package entidades;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId(){return id;}

    public String getNome() {return nome;}

    public double getPreco() {return preco;}

    public int getQuantidade() {return quantidade;}

    public void setId(int id){this.id = id;}

    public void setNome(String nome) {this.nome = nome;}

    public void setPreco(double preco) {this.preco = preco;}

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public double calcularValorEstoque(){
        return preco * quantidade;
    }

    public abstract String getDescricao();

    @Override
    public String toString(){return String.format("%d | %s | %.2f | %d | %.2f | %s",
            id, nome, preco, quantidade, calcularValorEstoque(), getDescricao());}
}

