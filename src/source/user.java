package source;

public class user {
	String nome, idade;
	double salario;

	public user(String nome, String idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	public void imprimeUsuario() {
		System.out.println("---Imprimindo informações de usuario...---");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
	}
}

