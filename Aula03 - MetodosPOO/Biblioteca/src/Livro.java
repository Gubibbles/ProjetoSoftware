public class Livro {

    //Atributos
    String titulo;
    String autor;
    int quantidade;
    double valorLivro;

    //Construtor
    public Livro(String titulo, String autor, int quantidade, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valorLivro = valor;
    }

    //Metodo Empresta Livro
    public void emprestaLivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    //Metodo Devolve livro
    public void devolveLivro(int quantidade) {
        if (quantidade > 0){
            this.quantidade += quantidade;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    public double valorTotal() {
        double valorTotal = this.valorLivro * this.quantidade;
        return valorTotal;
    }

    //Exibir as informações do livro
    public void exibirInformacoes(){
        System.out.println("Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nQuantidade: " + this.quantidade +
                "\nValor: " + this.valorLivro +
                "\nvalorTotal: " + valorTotal()
        );
    }
}
