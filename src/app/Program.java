package app;

import java.util.Scanner;

import source.*;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		user usuario = menu.preencherUsuario();
		gestao gestao1 = new gestao(usuario, 10);
		int opcao = 0;
		do {
			System.out.println("\n=== Menu de Opções ===\n");
			System.out.println("1. Adicionar Assinatura");
			System.out.println("2. Remover Assinatura");
			System.out.println("3. Alterar Assinatura");
			System.out.println("4. Calcular Despesas");
			System.out.println("5. Listar Assinaturas");
			System.out.println("6. Exibir Informações do Usuário");
			System.out.println("0. Sair\n");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				item i1 = menu.preencherItem();
				gestao1.adicionarAssinatura(i1);
				break;
			case 2:
				if(gestao1.contador != 0) {
					gestao1.listarAssinaturas();
					System.out.println("Digite o indíce da assinatura a ser removida: ");
					gestao1.removerAssinatura(sc.nextInt());
				}else
					System.out.println(gestao1.usuario.nome + " Não possui nenhuma assinatura cadastrada.");
					break;
			case 3:
				if(gestao1.contador != 0) {
					gestao1.listarAssinaturas();
					System.out.println("Digite o indíce da assinatura a ser removida: ");
					gestao1.alterarAssinatura(sc.nextInt());
				}else
					System.out.println(gestao1.usuario.nome + " Não possui nenhuma assinatura cadastrada.");
				break;
			case 4:
				gestao1.calcularDespesas();
				break;
			case 5:
				gestao1.listarAssinaturas();
				break;
			case 6:
				usuario.imprimeUsuario();
			}
		} while (opcao != 0);
	}

}
