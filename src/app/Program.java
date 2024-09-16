package app;

import java.util.Scanner;

import source.*;

public class Program {
	public static void main(String[] args) {
		menu menu = new menu();
		Scanner sc = new Scanner(System.in);
		user usuario = menu.preencherUsuario();
		gestao gestao1 = new gestao(usuario, 10);
		
		menu.escolha = 0;
		do {
			System.out.println(menu.printInterface());
			menu.escolha = sc.nextInt();
			sc.nextLine();

			switch (menu.escolha) {
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
		} while (menu.escolha != 0);
			sc.close();
	}

}
