import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Max", 1, 2, "Pug");
        Gato gato = new Gato("Gato", 2, 4, "Marrom");
        Peixe peixe = new Peixe("Albinaurico", 2, 1, "Cascudo albino");


        System.out.println(cachorro + "\n" + gato + "\n" + peixe + "\n");
    }
}
