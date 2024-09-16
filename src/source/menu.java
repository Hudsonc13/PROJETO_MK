package source;
import java.util.Scanner;
public class menu {
	
	public int escolha;
	
	
	public menu() {
		
	}
	
	public menu(int esc) {
		this.escolha = esc;
	}
	
	Scanner sc = new Scanner(System.in);
	
	
	public item preencherItem() {
		System.out.println("Insira as informações do item: ");
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Tipo: ");
		String tipo = sc.next();
		System.out.println("Descrição: ");
		sc.nextLine();
		String descricao = sc.nextLine();
		System.out.println("Valor: ");
		double valor = sc.nextDouble();
		sc.nextLine();
		System.out.println("Dia da cobrança: ");
		int dia = sc.nextInt();
		item i1 = new item(nome, tipo, descricao, valor, dia);
		return i1;	
	}
	
	public user preencherUsuario() {
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
	
	public String printInterface() {
		return "\n === Gerenciamento de Assinaturas 2000 === \n"	
			 + "1. Adicionar Assinatura\n"
			 + "2. Remover Assinatura\n" 
			 + "3. Alterar Assinatura\n"
			 + "4. Calcular Despesas\n"
			 + "5. Listar Assinaturas\n"
			 + "6. Exibir Informações do Usuário\n"
			 + "0. Sair\n"
			 + "Escolha uma opção: ";
	}
	
	
	
	
}
