package source;
import java.util.Scanner;
public class menu {
	static Scanner sc = new Scanner(System.in);
	public static user preencherUsuario() {
		System.out.println("Insira as informações do usuário: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Idade: ");
		String idade = sc.nextLine();
		System.out.println("Salario: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		user u1 = new user(nome,idade,salario);
		return u1;
	}
	public static item preencherItem() {
		System.out.println("Insira as informações do item: ");
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Tipo: ");
		String tipo = sc.next();
		System.out.println("Descrição: ");
		String descricao = sc.next();
		System.out.println("Valor: ");
		double valor = sc.nextDouble();
		sc.nextLine();
		System.out.println("Dia da cobrança: ");
		int dia = sc.nextInt();
		item i1 = new item(nome, tipo, descricao, valor, dia);
		return i1;
	}
}
