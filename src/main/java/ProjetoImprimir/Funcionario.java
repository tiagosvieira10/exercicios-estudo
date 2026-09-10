package ProjetoImprimir;

public class Funcionario implements Imprimivel {
    String nome;
    int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionários");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("___________");
    }
}
