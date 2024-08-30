package SistemaGerenciamentoDeCursos.Teste;

import java.util.ArrayList;
import java.util.Scanner;

import SistemaGerenciamentoDeCursos.Dominio.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        AlunoManager alunoManager = AlunoManager.newInstance(scanner, cursos);
        CursoManager cursoManager = CursoManager.newInstance(scanner, cursos);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Curso");
            System.out.println("2 - Adicionar Aluno a um curso");
            System.out.println("3 - Remover Aluno de um Curso");
            System.out.println("4 - Listar Cursos e Alunos");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cursoManager.cadastrar();
                    break;
                case 2:
                    alunoManager.adicionarAluno();
                    break;
                case 3:
                    alunoManager.removerAluno();
                    break;
                case 4:
                    cursoManager.listar();
                    break;
                case 5:
                    encerrarSistema(scanner);
                    break;
                default:
                    lidarComOpcaoInvalida();
                    break;
            }
        }
    }

    private static void lidarComOpcaoInvalida() {
        System.out.println("Opção Inválida, escolha novamente.");
    }

    private static void encerrarSistema(Scanner scanner) {
        System.out.println("Encerrando sistema...");
        scanner.close();
    }
}
