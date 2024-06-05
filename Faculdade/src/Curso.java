import java.util.ArrayList;

public class Curso{
    private String nome;
    private int codigo;
    private String professorResponsavel;
    private ArrayList<Aluno> alunosMatriculados;
    
    public Curso(String nome, int idade, String cpf, String nome2, int codigo, String professorResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.professorResponsavel = professorResponsavel;
        this.alunosMatriculados = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getProfessorResponsavel() {
        return professorResponsavel;
    }
    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void AdicionarAluno(Aluno aluno) {
       alunosMatriculados.add(aluno);
    }

    public void RemoverAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunosMatriculados) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}