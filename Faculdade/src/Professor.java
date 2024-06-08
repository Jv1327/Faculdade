public class Professor extends Pessoa {
    private double salario;
    private String disciplina;
    private int quantidadeAulaDada;

    public Professor(String nome, int idade, String cpf, double salario, String disciplina) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
        this.quantidadeAulaDada = 0;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + salario);
        System.out.println("Disciplina: " + disciplina);
    }

    public void darAula(int qtdadeAula) {
        this.quantidadeAulaDada += qtdadeAula;
    }
}