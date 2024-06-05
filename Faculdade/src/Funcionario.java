public class Funcionario extends Pessoa{
    private String cargo;
    private int setor;
    
    public Funcionario(String nome, int idade, String cpf, String cargo, int setor) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.setor = setor;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getSetor() {
        return setor;
    }
    public void setSetor(int setor) {
        this.setor = setor;
    }

    public void exibirDados() {
        System.out.println("*******Informação********");
        System.out.println("nome:" + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Setor: " + this.getSetor());
    }

    public void executarTarefa(String tarefa){
        System.out.println("Executar Tarefa" + tarefa);
    }

    class MatriculaInvalidaException extends Exception {
        public MatriculaInvalidaException(String message) {
            super(message);
        }
    }
}
