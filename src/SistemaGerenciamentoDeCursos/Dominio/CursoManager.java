package SistemaGerenciamentoDeCursos.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class CursoManager {

    private final Scanner scanner;
    private final ArrayList<Curso> cursos;
    private static CursoManager instance;

    private CursoManager(Scanner scanner, ArrayList<Curso> cursos) {
        this.scanner = scanner;
        this.cursos = cursos;
    }

    public static CursoManager newInstance(Scanner scanner, ArrayList<Curso> cursos) {
        if (instance == null) {
            instance = new CursoManager(scanner, cursos);
        }
        return instance;
    }

    public void cadastrar() {
        System.out.println("Escreva o nome do Curso: ");
        String nomeCurso = scanner.nextLine();

        System.out.println("Escreva a carga horária do curso: ");
        int cargaHoraria = scanner.nextInt();

        System.out.println("Escreva o código do curso (ex: 100, 200): ");
        int codigoCurso = scanner.nextInt();
        scanner.nextLine();

        Curso curso = new Curso(nomeCurso, cargaHoraria, codigoCurso);
        cursos.add(curso);
        System.out.println("Curso " + nomeCurso + " cadastrado com sucesso!");
    }

    public void listar() {
        if (cursos == null || cursos.isEmpty()) {
            System.out.println("Nenhum curso registrado ainda");
        } else {
            for (Curso c : cursos) {
                System.out.println("Curso: " + c.getNome() + ", código do curso: " + c.getCodigoCurso());
                c.getAlunos().forEach(a -> System.out.println("Aluno: " + a.getNome() + ", Matrícula: " + a.getNumeroMatricula()));
            }
        }
        System.out.println("---------------------------------");
    }
}
