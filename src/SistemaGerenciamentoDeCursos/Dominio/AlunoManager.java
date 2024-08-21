package SistemaGerenciamentoDeCursos.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoManager {

    private final Scanner scanner;
    private final ArrayList<Curso> cursos;
    private static AlunoManager instance;

    private AlunoManager(Scanner scanner, ArrayList<Curso> cursos) {
        this.scanner = scanner;
        this.cursos = cursos;
    }

    public static AlunoManager newInstance(Scanner scanner, ArrayList<Curso> cursos) {
        if (instance == null) {
            instance = new AlunoManager(scanner, cursos);
        }
        return instance;
    }

    public void adicionarAluno() {
        System.out.println("Digite o nome do aluno(a): ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Escolha o código do curso que deseja matricular o" +
                " aluno (ex: 100, 200): ");
        int codigoCursoAdicionar = scanner.nextInt();
        scanner.nextLine();

        Curso curso = cursos.stream()
                .filter(c -> c.getCodigoCurso() == codigoCursoAdicionar)
                .findFirst()
                .orElse(null);

        if (curso == null) {
            System.out.println("Curso não encontrado.");
            return;
        }

        Aluno aluno = new Aluno(nomeAluno);
        curso.adicionarAluno(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado com " +
                "a matrícula " + aluno.getNumeroMatricula());

    }

    public void removerAluno() {
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
