package SistemaGerenciamentoDeCursos.Dominio;


import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarCurso {
    public static void cadastrar (Scanner scanner, ArrayList<Curso> cursos){
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
}
