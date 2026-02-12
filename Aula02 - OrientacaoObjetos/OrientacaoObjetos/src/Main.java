import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Lanche xEgg = new Lanche();
        xEgg.nome = "X-Egg";
        xEgg.preco = 24.90;
        xEgg.descricao = "Pão, maionese, ovo, hamburguer, queijo";

        Lanche xTudo = new Lanche();
        xTudo.nome = "X-Tudo";
        xTudo.preco = 29.90;
        xTudo.descricao = "Pão, maionese, ovo, hamburguer, queijo, presunto, bacon, tomate, alface, cebola";

        xTudo.exibir();
        xEgg.exibir();
    }
}
