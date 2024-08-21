package SistemaGerenciamentoDeCursos.Dominio;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private int codigoCurso;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private int contadorMAtricula = 0;

    public Curso(String nome, int cargaHoraria, int codigoCurso) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.codigoCurso = codigoCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno){
        aluno.setCurso(this);
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
        aluno.setCurso(null);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getNumeroMatricula());
        }
    }

    public int gerarNumeroMatricula(){
        contadorMAtricula++;
        return codigoCurso * 100 + contadorMAtricula;
    }

}
