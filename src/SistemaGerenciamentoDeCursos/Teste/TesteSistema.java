package SistemaGerenciamentoDeCursos.Teste;
import java.util.ArrayList;
import java.util.Scanner;
import SistemaGerenciamentoDeCursos.Dominio.Aluno;
import SistemaGerenciamentoDeCursos.Dominio.Curso;

public class TesteSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Curso> cursos = new ArrayList<>();

        while(true){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Curso");
            System.out.println("2 - Adicionar Aluno a um curso");
            System.out.println("3 - Remover Aluno de um Curso");
            System.out.println("4 - Listar Cursos e Alunos");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Escreva o nome do Curso: ");
                    String nomeCurso = scanner.nextLine();

                    System.out.println("Escreva a carga horária do curso: ");
                    int cargaHoraria = scanner.nextInt();

                    System.out.println("Escreva o código do curso (ex: 100, " +
                            "200): ");
                    int codigoCurso = scanner.nextInt();
                    scanner.nextLine();

                    Curso curso = new Curso(nomeCurso, cargaHoraria, codigoCurso);
                    cursos.add(curso);
                    System.out.println("Curso " + nomeCurso + " cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.println("Digite o nome do Aluno(a): ");
                    String nomeAluno = scanner.nextLine();

                    System.out.println("Escolha o código do curso que deseja " +
                            "matricular o aluno (ex: 100, 200): ");
                    int codigoCursoAdicionar = scanner.nextInt();
                    scanner.nextLine();

                    Curso cursoAdicionar = cursos.stream()
                            .filter(c -> c.getCodigoCurso() == codigoCursoAdicionar)
                            .findFirst()
                            .orElse(null);

                    if (cursoAdicionar != null){
                        Aluno aluno = new Aluno(nomeAluno);
                        cursoAdicionar.adicionarAluno(aluno);
                        System.out.println("Aluno " + aluno.getNome() +
                                " adicionado com a matrícula " + aluno.getNumeroMatricula());
                    } else {
                        System.out.println("Curso não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o número de matrícula do aluno" +
                            " que deseja remover: ");
                    int matriculaAlunoRemover = scanner.nextInt();
                    scanner.nextLine();

                    boolean alunoRemovido = false;
                    for (Curso c: cursos){
                        Aluno alunoParaRemover = c.getAlunos().stream()
                                .filter(a -> a.getNumeroMatricula() == matriculaAlunoRemover)
                                .findFirst()
                                .orElse(null);

                        if(alunoParaRemover !=null){
                            c.removerAluno(alunoParaRemover);
                            alunoRemovido = true;
                            System.out.println("Aluno " + alunoParaRemover.getNome() + " removido.");
                            break;
                        }
                        if (!alunoRemovido) {
                            System.out.println("Aluno não encontrado.");
                        }
                        break;
                    }

                case 4:
                    for (Curso c : cursos){
                        System.out.println("Curso: " + c.getNome() + ", " +
                                "código do curso: " + c.getCodigoCurso());
                        c.listarAlunos();
                    }
                    break;

                case 5:
                    System.out.println("Encerrando sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção Inválida, escolha novamente.");
                    break;
            }
        }
    }
}
