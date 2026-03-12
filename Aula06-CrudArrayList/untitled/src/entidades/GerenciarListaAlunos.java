package entidades;

import java.util.ArrayList;

public class GerenciarListaAlunos {
    private ArrayList<Aluno> ListaAlunos = new ArrayList<>();

    //Create - Cadastrar Aluno
    public void adicionarAluno(Aluno aluno) {
        ListaAlunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }
    
    //Read - Listar alunos
    public void listarAlunos() {
        if(ListaAlunos.isEmpty()) {
            System.out.println("Nenhum Aluno encontrado.");
        } else {
            System.out.println("| ID | NOME | NOTA 1 | NOTA 2 | MÉDIA | SITUAÇÃO |");
            for (int i=0; i<ListaAlunos.size(); i++) {
                System.out.println("|" + i + ListaAlunos.get(i));
            }
        }
    }

    public void alterarInformacoesAluno(int idAluno, String nomeAluno, double notaAluno, double notaAluno2) {

        Aluno aluno = ListaAlunos.get(idAluno);

        aluno.setNome(nomeAluno);
        aluno.setNota1(notaAluno);
        aluno.setNota2(notaAluno2);

        System.out.println("Aluno alterado com sucesso!");

    }

    public void removerAluno(int idAluno) {
        ListaAlunos.remove(idAluno);
        System.out.println("Aluno removido com sucesso!");
    }
}
