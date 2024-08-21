package SistemaGerenciamentoDeCursos.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarAluno {
    public static void adicionar(Scanner scanner, ArrayList<Curso> cursos) {
        System.out.println("Digite o nome do aluno(a): ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Escolha o código do curso que deseja matricular o" +
                " aluno (ex: 100, 200): ");
        int codigoCursoAdicionar = scanner.nextInt();
        scanner.nextLine();

        Curso cursoAdicionar = cursos.stream()
                .filter(c -> c.getCodigoCurso() == codigoCursoAdicionar)
                .findFirst()
                .orElse(null);

        if (cursoAdicionar != null) {
            Aluno aluno = new Aluno(nomeAluno);
            cursoAdicionar.adicionarAluno(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado com " +
                    "a matrícula " + aluno.getNumeroMatricula());
        }else{
            System.out.println("Curso não encontrado.");
        }
    }
}
