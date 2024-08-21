package SistemaGerenciamentoDeCursos.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverAluno {
    public static void remover (Scanner scanner, ArrayList<Curso> cursos) {
        System.out.println("Digite o número da matrícula do aluno que deseja " +
                "remover: ");
        int matriculaAlunoRemover = scanner.nextInt();
        scanner.nextLine();

        boolean alunoRemovido = false;
        for (Curso c : cursos) {
            Aluno alunoParaRemover = c.getAlunos().stream()
                    .filter(a -> a.getNumeroMatricula() == matriculaAlunoRemover)
                    .findFirst()
                    .orElse(null);

            if (alunoParaRemover != null) {
                c.removerAluno(alunoParaRemover);
                alunoRemovido = true;
                System.out.println("Aluno: " + alunoParaRemover.getNome() + " removido com sucesso!");
                break;
            }
        }
        if (!alunoRemovido) {
            System.out.println("Aluno não encontrado!");
        }
    }
}
