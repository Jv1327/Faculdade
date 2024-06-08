import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Cadastro de Aluno
        System.out.println("Cadastro de Aluno:");
        System.out.print("Nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeAluno = scanner.nextInt();
        scanner.nextLine(); // Consumir newline
        System.out.print("CPF: ");
        String cpfAluno = scanner.nextLine();
        System.out.print("Matricula: ");
        String matriculaAluno = scanner.nextLine();
        System.out.print("Curso: ");
        String cursoAluno = scanner.nextLine();

        Aluno aluno = new Aluno(nomeAluno, idadeAluno, cpfAluno, matriculaAluno, cursoAluno);
        alunos.add(aluno);

        // Cadastro de Professor
        System.out.println("\nCadastro de Professor:");
        System.out.print("Nome: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeProfessor = scanner.nextInt();
        scanner.nextLine(); // Consumir newline
        System.out.print("CPF: ");
        String cpfProfessor = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioProfessor = scanner.nextDouble();
        scanner.nextLine(); // Consumir newline
        System.out.print("Disciplina: ");
        String disciplinaProfessor = scanner.nextLine();

        Professor professor = new Professor(nomeProfessor, idadeProfessor, cpfProfessor, salarioProfessor, disciplinaProfessor);
        professores.add(professor);

        // Cadastro de Funcionario
        System.out.println("\nCadastro de Funcionario:");
        System.out.print("Nome: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeFuncionario = scanner.nextInt();
        scanner.nextLine(); // Consumir newline
        System.out.print("CPF: ");
        String cpfFuncionario = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargoFuncionario = scanner.nextLine();
        System.out.print("Setor: ");
        String setorFuncionario = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nomeFuncionario, idadeFuncionario, cpfFuncionario, cargoFuncionario, setorFuncionario);
        funcionarios.add(funcionario);

        // Exibir dados polimorficamente
        System.out.println("\nDados dos Alunos:");
        for (Aluno a : alunos) {
            a.exibirDados();
        }

        System.out.println("\nDados dos Professores:");
        for (Professor p : professores) {
            p.exibirDados();
        }

        System.out.println("\nDados dos Funcionarios:");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }

        // Teste de exceção
        try {
            aluno.realizarMatricula("12345", "Curso Extra");
            aluno.realizarMatricula("12345", "Curso Extra");
            aluno.realizarMatricula("12345", "Curso Extra");
            aluno.realizarMatricula("12345", "Curso Extra");
            aluno.realizarMatricula("12345", "Curso Extra");
            aluno.realizarMatricula("12345", "Curso Extra");
        } catch (MatriculaInvalidaException e) {
            System.out.println("Erro ao matricular aluno: " + e.getMessage());
        }

        scanner.close();
    }
}