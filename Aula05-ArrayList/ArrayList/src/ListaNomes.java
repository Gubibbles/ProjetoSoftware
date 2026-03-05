import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Cleber");
        listaNomes.add("Antonio");
        listaNomes.add("Rodrigo");
        listaNomes.add("Pamela");
        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add("Antonio");
        listaNomes.add("Rodrigo");
        listaNomes.add("Rodrigo");

        //Função anonima

        //remove valores iguais a "Maria"
        //listaNomes.removeIf( nome -> nome == "Rodrigo");
        listaNomes.removeIf(nome -> nome.equals("Rodrigo"));

        //remove a partir de uma letra
        listaNomes.removeIf(nome -> nome.contains("a"));

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

    }
}
