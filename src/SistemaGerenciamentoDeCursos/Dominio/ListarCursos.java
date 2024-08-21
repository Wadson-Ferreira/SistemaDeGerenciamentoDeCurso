package SistemaGerenciamentoDeCursos.Dominio;

import java.util.ArrayList;

public class ListarCursos {
    public static void listar (ArrayList<Curso> cursos){
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
