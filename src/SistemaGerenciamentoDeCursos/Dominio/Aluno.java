package SistemaGerenciamentoDeCursos.Dominio;

public class Aluno {
    private String nome;
    private int numeroMatricula;
    private static int contadorMatricula=0;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void gerarNumeroMatricula(Curso curso) {
        if (curso != null){
            contadorMatricula++;
            this.numeroMatricula = curso.getCodigoCurso() * 100 + contadorMatricula;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
        gerarNumeroMatricula(curso);
    }
}
