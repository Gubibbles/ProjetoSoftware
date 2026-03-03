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
        if (descricao.isBlank()) {
            System.out.println("Informe uma descrição válida!");
        } else {
            this.descricao = descricao;
        }
    }

    public void setValor(double valor) {
        if(valor <= 0) {
            System.out.println("Informe um valor maior que zero!");
        } else {
            this.valor = valor;
            System.out.println("Valor alterado com sucesso!");
        }
    }

    public void verificaDisponivel() {
        this.disponivel = this.estoque >0;
    }

    public void incrementaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            verificaDisponivel();
            System.out.println("Estoque alterado com sucesso!");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public boolean decrementaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            verificaDisponivel();
            return true;
        } else {
            return false;
        }
    }

    public double valorTotal(int quantidade) {
        return this.valor * quantidade;
    }
}
