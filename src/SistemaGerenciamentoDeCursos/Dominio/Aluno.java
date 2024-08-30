package SistemaGerenciamentoDeCursos.Dominio;

public class Aluno {
    private String nome;
    private int numeroMatricula;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void gerarNumeroMatricula(Curso curso) {
        if (curso != null) {
            this.numeroMatricula = curso.gerarNumeroMatricula();
        } else {
            System.out.println("Curso é null, não é possível gerar matrícula.");
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
        if(curso != null){
        gerarNumeroMatricula(curso);
        }
    }
}
