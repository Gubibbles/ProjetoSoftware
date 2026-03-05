import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        ArrayList<Integer> listaNotas = new ArrayList<>();

        //Adicionar Valores
        listaNotas.add(8);
        listaNotas.add(6);
        listaNotas.add(5);
        listaNotas.add(10);
        listaNotas.add(10);
        System.out.println(listaNotas);

        //Adicionar valores em uma posição especifica
        listaNotas.add(1, 3);
        listaNotas.add(2, 4);
        System.out.println(listaNotas);

        //verificar tamanho da lista
        System.out.println("O tamanho da lista é: " + listaNotas.size());

        //Acessar um elemento da lista
        System.out.println("A posição primária tem valor: " + listaNotas.get(0));
        listaNotas.remove(3);
        System.out.println(listaNotas);

        //Alterar um valor da lista
        listaNotas.set(0, 20);
        System.out.println(listaNotas);

        //Remover um item
        listaNotas.remove(2); // posição
        listaNotas.remove(listaNotas.indexOf(20)); // Pelo valor
        System.out.println(listaNotas);

        //remover a partir de uma função lambda
        listaNotas.removeIf(element -> element < 7);
        System.out.println(listaNotas);


        for (Integer nota : listaNotas) {
            System.out.println(nota);
        }

    }


}
