public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;

   

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

    public void exibirDados() {
        System.out.println("*******Informação********");
        System.out.println("nome:" + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.getCpf());
    }
}
