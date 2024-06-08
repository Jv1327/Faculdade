public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;
    private String tarefaExecutada;

    public Funcionario(String nome, int idade, String cpf, String cargo, String setor) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.setor = setor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Setor: " + setor);
    }

    public void executarTarefa(String tarefa) {
        this.tarefaExecutada = tarefa;
        System.out.println("Tarefa executada: " + tarefa);
    }
}
