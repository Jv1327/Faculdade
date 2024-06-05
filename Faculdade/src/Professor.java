public class Professor extends Pessoa{
    private int salario;
    private String disciplina;
    
    public Professor(String nome, int idade, String cpf, int salario, String disciplina) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("*******Informação********");
        System.out.println("nome:" + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Disciplina " + this.getDisciplina());
    }

    public void darAula() {
        System.out.println("Você está dando aula de: " + disciplina);
    }
}
