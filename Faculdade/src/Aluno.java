public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private int cursosMatriculados;

    public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.cursosMatriculados = 0;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }

    public void realizarMatricula(String matricula, String curso) throws MatriculaInvalidaException {
        if (cursosMatriculados >= 5) {
            throw new MatriculaInvalidaException("Aluno não pode se matricular em mais de 5 cursos simultaneamente.");
        }
        this.matricula = matricula;
        this.curso = curso;
        cursosMatriculados++;
    }
}
