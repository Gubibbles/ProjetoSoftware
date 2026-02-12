public class MainCarro {
    public static void main(String[] args) {

        Carro Fiesta = new Carro();
        Fiesta.modelo = "Fiesta";
        Fiesta.ano = 2006;
        Fiesta.marca = "Ford";

        Carro Palio = new Carro();
        Palio.modelo = "Palio";
        Palio.ano = 2004;
        Palio.marca = "Fiat";

        Fiesta.exibirInformacoes();
        Palio.exibirInformacoes();
    }
}
