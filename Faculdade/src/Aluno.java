public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String cpf, int matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void exibirDados() {
        System.out.println("*******Informação********");
        System.out.println("nome:" + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    }

    public void realizarMatricula() {
        System.out.println("Se Matricular");
    }
}
