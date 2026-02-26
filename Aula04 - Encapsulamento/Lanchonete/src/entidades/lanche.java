package entidades;

public class lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    //construtor


    //toString
    @Override
    public String toString() {
        return "nome='" + nome +
                "\ndescricao'" + descricao +
                "\nvalor: R$" + valor +
                "\nestoque:" + estoque +
                "\ndisponivel:" + disponivel ;

    }
//getter
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = disponivel;
        this.disponivel = estoque >0;

        //if (estoque <= 0) {
            //this.disponivel = false;
        //else {
            //this.disponivel = true;//


    }
//setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
