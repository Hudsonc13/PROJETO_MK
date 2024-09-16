package source;

import java.util.Scanner;

public class gestao {
	public item assinaturas[];
	public user usuario;
	public int contador;

	public gestao(user usuario, int tamMax) {
		this.usuario = usuario;
		this.assinaturas = new item[tamMax];
		this.contador = 0;
	}

	public void adicionarAssinatura(item assinatura) {
		if (contador < assinaturas.length) {
			assinaturas[contador] = assinatura;
			contador++;
			System.out.println("Assinatura adicionada com sucesso!");
		} else {
			System.out.println("Limite de assinaturas atingido");
		}
	}

	public void removerAssinatura(int index) {
			index--;
			if (index < contador & !(index < 0)) {
				for (int j = index; j < contador - 1; j++) {
					assinaturas[j] = assinaturas[j + 1];
				}
				assinaturas[contador - 1] = null;
				contador--;
				System.out.println("Assinatura removida com sucesso!");
			} else {
				System.out.println("Assinatura não encontrada.");
			}
	}

	public void alterarAssinatura(int index) {
		Scanner sc = new Scanner(System.in);
		index--;
		if (index < contador & !(index < 0)) {
			System.out.println("Alterando a assinatura: " + assinaturas[index].nome);
			System.out.print("Novo nome: ");
			assinaturas[index].nome = sc.nextLine();
			System.out.print("Novo valor: ");
			assinaturas[index].valor = sc.nextDouble();
			sc.nextLine();
			System.out.print("Novo dia de vencimento: ");
			assinaturas[index].dia = sc.nextInt();
			sc.nextLine();
			System.out.print("Novo tipo: ");
			assinaturas[index].tipo = sc.nextLine();
			System.out.print("Nova descrição: ");
			assinaturas[index].descricao = sc.nextLine();
			System.out.println("Assinatura alterada com sucesso!");
		} else {
			System.out.println("indice inválido.");
		}
	}

	public void calcularDespesas() {
		double total = 0;
		for (int i = 0; i < contador; i++) {
			total += assinaturas[i].valor;
		}
		System.out.println("Total de despesas com assinaturas: R$ " + total);
	}

	public void listarAssinaturas() {
		if (contador == 0) {
			System.out.println(usuario.nome + " Não possui nenhuma assinatura cadastrada.");
		} else {
			System.out.println("------------------------");
			for (int i = 0; i < contador; i++) {
				System.out.println("Assinatura " + (i + 1) + ":");
				assinaturas[i].exibirInfo();
				System.out.println("------------------------");
			}
		}
	}
}
