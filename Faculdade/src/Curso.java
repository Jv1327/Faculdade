import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String codigo;
    private Professor professorResponsavel;
    private List<Aluno> alunos;

    public Curso(String nome, String codigo, Professor professorResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.professorResponsavel = professorResponsavel;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
        }
    }
}
