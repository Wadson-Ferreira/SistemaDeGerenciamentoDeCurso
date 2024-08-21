package SistemaGerenciamentoDeCursos.Teste;

import java.util.ArrayList;
import java.util.Scanner;

import SistemaGerenciamentoDeCursos.Dominio.*;

public class TesteSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Curso> cursos = new ArrayList<>();

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
                case 1: CadastrarCurso.cadastrar(scanner, cursos);
                    break;
                case 2: AdicionarAluno.adicionar(scanner, cursos);
                    break;
                case 3: RemoverAluno.remover(scanner, cursos);
                    break;
                case 4: ListarCursos.listar(cursos);
                    break;
                case 5: encerrarSistema(scanner);
                    return;
                default: lidarComOpcaoInvalida();
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
